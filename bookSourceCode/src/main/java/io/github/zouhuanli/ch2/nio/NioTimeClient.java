package io.github.zouhuanli.ch2.nio;

import java.io.IOException;

public class NioTimeClient {
    public static void main(String[] args) throws IOException
    {
        int port = 8080;
        if (args != null && args.length > 0)
        {
            try
            {
                port = Integer.valueOf(args[0]);
            }
            catch (NumberFormatException e)
            {
                // 采用默认值
            }
        }
        new Thread(new NioTimeClientHandler("127.0.0.1", port), "NIO-TimeClient-001").start();
    }
}
