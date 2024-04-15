package io.github.zouhuanli.ch4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.StandardCharsets;

public class TimeClientHandler extends ChannelInboundHandlerAdapter {
    private final ByteBuf firstMessage;
    private int count = 0;

    public TimeClientHandler() {
        byte[] req = "QUERY TIME ORDER".getBytes();
        firstMessage = Unpooled.copiedBuffer(req);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ByteBuf msg;
        for (int i = 0; i < 100; i++) {
            msg = Unpooled.copiedBuffer(firstMessage);
            ctx.writeAndFlush(msg);
        }
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf buf = (ByteBuf) msg;
        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        String body = new String(req, StandardCharsets.UTF_8);
        System.out.println("Now is : " + body + " ; the count is : " + (++count));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // 释放资源
        System.out.println("Unexpected exception from downstream : " + cause.getMessage());
        ctx.close();
    }
}
