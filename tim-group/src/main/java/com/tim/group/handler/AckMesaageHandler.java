package com.tim.group.handler;

import com.google.protobuf.MessageLite;
import com.tim.common.protos.Message.MessageAck;
import com.tim.group.channel.NettyChannelManager;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class AckMesaageHandler  extends SimpleChannelInboundHandler<MessageLite> {

    @Autowired
    private NettyChannelManager nettyChannelManager;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("client connected remote address:{},id:{}", ctx.channel().remoteAddress(),
            ctx.channel().id().asShortText());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext,
        MessageLite messageLite) throws Exception {
        if (messageLite instanceof MessageAck) {

        }
        channelHandlerContext.fireChannelRead(messageLite);
    }

}
