package io.github.zouhuanli.ch2.aio;

public class TimeClient {
    public static void main(String[] args) {
        new Thread(new TimeClientHandler("127.0.0.1", 8080)).start();
    }
}
