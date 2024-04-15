package io.github.zouhuanli.ch4;


import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * 引导类和客户端，比较固化
 */
public class TimeClient {
    public static void main(String[] args) {
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChannelInitializer() {
                             @Override
                             protected void initChannel(Channel ch) {
                                 //主要拓展点
                                 ch.pipeline().addLast(new TimeClientHandler());
                             }
                         }
                );
        try {
            ChannelFuture future = bootstrap.connect("127.0.0.1", 8080).sync();
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            System.exit(-1);
        } finally {
            group.shutdownGracefully();
        }

    }
}
