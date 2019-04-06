package com.tim.access.handler;

import com.google.protobuf.MessageLite;
import com.tim.common.netty.ChannelManager;
import com.tim.common.protos.Message.MessageAck;
import com.tim.common.protos.Message.UpDownMessage;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Sharable
@Slf4j
public class MesaageHandler extends SimpleChannelInboundHandler<MessageLite> {

    @Autowired
    private ChannelManager uidChannelManager;

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext,
        MessageLite messageLite) throws Exception {
        if (messageLite instanceof MessageAck) {

        } else if (messageLite instanceof UpDownMessage) {

        } else {
            channelHandlerContext.fireChannelRead(messageLite);
        }
    }

}
