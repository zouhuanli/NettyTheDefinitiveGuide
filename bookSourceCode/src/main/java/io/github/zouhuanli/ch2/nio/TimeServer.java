package io.github.zouhuanli.ch2.nio;

public class TimeServer {

    public static void main(String[] args) {
        int port = 8080;
        NioTimeServerHandler server;
        server = new NioTimeServerHandler(port);
        new Thread(server).start();
    }
}
