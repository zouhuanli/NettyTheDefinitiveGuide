package io.github.zouhuanli.ch2.bio;

import java.io.IOException;
import java.net.ServerSocket;

public class TimeServer {

    public static void  main(String [] args) throws IOException {
        int  port = 8080;
        ServerSocket server;
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The time server is start in port : " + port);
        while(true){
            new Thread(new TimeServerHandler(server.accept())).start();
        }
    }
}
