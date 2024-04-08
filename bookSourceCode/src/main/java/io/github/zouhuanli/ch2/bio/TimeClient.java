package io.github.zouhuanli.ch2.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TimeClient {
    /**
     * 读取控制台输入 发送到127.0.0.1:8080，反现服务器返回结果
     * BAD PRACTICE:未处理异常
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        int port = 8080;
        Socket clientSocket;
        BufferedReader in;
        PrintWriter out;
        clientSocket = new Socket("127.0.0.1", port);
        in = new BufferedReader(new java.io.InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        out.println("QUERY TIME ORDER");
        System.out.println("Send order 2 server succeed.");
        String resp = in.readLine();
        System.out.println("Now is :" + resp);
    }
}
