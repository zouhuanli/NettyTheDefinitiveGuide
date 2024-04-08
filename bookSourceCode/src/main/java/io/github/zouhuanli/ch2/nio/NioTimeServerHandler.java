package io.github.zouhuanli.ch2.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class NioTimeServer implements Runnable {
    private final int port;
    private final Selector selector;
    private final ServerSocketChannel serverSocketChannel;
    private volatile boolean stop;

    public NioTimeServer(int port) {
        this.port = port;
        try {
            selector = Selector.open();
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(this.port), 1024);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("The time server is start in port : " + port);
            stop = false;
        } catch (ClosedChannelException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void stop() {
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                selector.select(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> it = selectionKeys.iterator();
                while (it.hasNext()) {
                    SelectionKey key = it.next();
                    it.remove();
                    try {
                        handleInput(key);
                    } catch (Exception e) {
                        if (key != null) {
                            key.cancel();
                            if (key.channel() != null) {
                                key.channel().close();
                            }
                        }
                    }
                }
            } catch (IOException e) {
                try {
                    selector.close();
                } catch (IOException ex) {
                    ex.printStackTrace();

                }
            }
        }
    }

    private void handleInput(SelectionKey key) throws IOException {
        if (key.isValid()) {
            // 处理新接入的请求消息
            if (key.isAcceptable()) {
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                try {
                    SocketChannel sc = ssc.accept();
                    sc.configureBlocking(false);
                    sc.register(selector, SelectionKey.OP_READ);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 处理读消息
            if (key.isReadable()) {
                SocketChannel socketChannel = (SocketChannel) key.channel();
                ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                int readBytes = 0;
                readBytes = socketChannel.read(readBuffer);

                if (readBytes > 0) {
                    readBuffer.flip();
                    byte[] bytes = new byte[readBuffer.remaining()];
                    readBuffer.get(bytes);
                    String body = "";
                    body = new String(bytes, StandardCharsets.UTF_8);
                    System.out.println("The time server receive order : " + body);
                    String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) : "BAD ORDER";
                    doWrite(socketChannel, currentTime);
                } else if (readBytes < 0) {
                    key.cancel();
                    try {
                        socketChannel.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    // 读到0字节，忽略
                }


            }
        }
    }

    // 异步写
    private void doWrite(SocketChannel socketChannel, String currentTime) {
        if (currentTime != null && currentTime.trim().length() > 0) {
            ByteBuffer writeBuffer = ByteBuffer.allocate(currentTime.getBytes().length);
            writeBuffer.put(currentTime.getBytes());
            writeBuffer.flip();
            try {
                socketChannel.write(writeBuffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
