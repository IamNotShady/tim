package com.raven.group.tcp.handler;

import com.raven.common.loadbalance.Server;
import com.raven.common.netty.ServerChannelManager;
import com.raven.common.protos.Message.Code;
import com.raven.common.protos.Message.ConverType;
import com.raven.common.protos.Message.MessageAck;
import com.raven.common.protos.Message.ServerInfo;
import com.raven.common.protos.Message.RavenMessage;
import com.raven.common.protos.Message.RavenMessage.Type;
import com.raven.common.protos.Message.UpDownMessage;
import com.raven.common.utils.UidUtil;
import com.raven.group.restful.validator.GroupValidator;
import com.raven.group.tcp.manager.SenderManager;
import com.raven.storage.conver.ConverManager;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Sharable
@Slf4j
public class MessageHandler extends SimpleChannelInboundHandler<RavenMessage> {

    @Autowired
    private ConverManager converManager;

    @Autowired
    private SenderManager senderManager;

    @Autowired
    private ServerChannelManager channelManager;

    @Autowired
    private GroupValidator groupValidator;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RavenMessage message) throws Exception {
        if (message.getType() == Type.UpDownMessage) {
            UpDownMessage upDownMessage = message.getUpDownMessage();
            String convId = upDownMessage.getConverId();
            String groupId = upDownMessage.getGroupId();

            if (upDownMessage.getConverType() == ConverType.GROUP) {
                log.info("received msg id:{}", upDownMessage.getId());

                if (!StringUtils.isEmpty(convId) && converManager.isGroupConverIdValid(convId)) {
                    // if convId exists , use it.
                    cacheAndTransferMsg(upDownMessage, convId);
                    sendACK(ctx, upDownMessage, Code.SUCCESS);
                } else if (!StringUtils.isEmpty(groupId) && groupValidator.isValid(groupId)) {
                    // otherwise use group id.
                    String mappingConvId = UidUtil.uuid24ByFactor(groupId);
                    cacheAndTransferMsg(upDownMessage, mappingConvId);
                    sendACK(ctx, upDownMessage, Code.SUCCESS);
                } else {
                    log.error("parameters not valid.");
                    sendACK(ctx, upDownMessage, Code.FAIL);
                }
            } else {
                log.error("illegal Message.");
                sendACK(ctx, upDownMessage, Code.FAIL);
            }
        } else if (message.getType() ==  Type.ServerInfo) {
            ServerInfo serverInfo =  message.getServerInfo();
            Server server = new Server(serverInfo.getIp(), serverInfo.getPort());
            log.info("raven-access server connect success ip:{},port{}",server.getIp(),server.getPort());
            channelManager.addServer2Channel(server, ctx.channel());
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("client connected remote address:{},id:{}", ctx.channel().remoteAddress(),
            ctx.channel().id().asShortText());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.info("client disconnected remote address:{},id:{}", ctx.channel().remoteAddress(),
            ctx.channel().id().asShortText());
        Server server = channelManager.getServerByChannel(ctx.channel());
        channelManager.removeServer(server);
    }

    private void sendACK(ChannelHandlerContext ctx, UpDownMessage message, Code code) {
        MessageAck messageAck = MessageAck.newBuilder()
            .setId(message.getId())
            .setTargetUid(message.getFromUid())
            .setCid(message.getCid())
            .setCode(code)
            .setTime(System.currentTimeMillis())
            .setConverId(message.getConverId())
            .build();
        RavenMessage ravenMessage = RavenMessage.newBuilder().setType(Type.MessageAck).setMessageAck(messageAck).build();
        ctx.writeAndFlush(ravenMessage);
    }

    private void cacheAndTransferMsg(UpDownMessage upDownMessage, String convId) {
        try {
            converManager.cacheMsg2Conver(upDownMessage.getContent(), convId);
            UpDownMessage downMessage = UpDownMessage.newBuilder()
                .setId(upDownMessage.getId())
                .setFromUid(upDownMessage.getFromUid())
                .setTargetUid(upDownMessage.getTargetUid())
                .setConverType(upDownMessage.getConverType())
                .setContent(upDownMessage.getContent())
                .setConverId(convId)
                .build();
            senderManager.addMessage(downMessage);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        if ("Connection reset by peer".equals(cause.getMessage())) {
            return;
        }
        log.error(cause.getMessage(), cause);
    }

}