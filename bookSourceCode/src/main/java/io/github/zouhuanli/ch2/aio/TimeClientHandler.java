package io.github.zouhuanli.ch2.aio;

import java.nio.channels.CompletionHandler;

public class TimClientHandler  implements Runnable, CompletionHandler<Void,TimClientHandler> {
    @Override
    public void run() {

    }

    @Override
    public void completed(Void result, TimClientHandler attachment) {
        
    }

    @Override
    public void failed(Throwable exc, TimClientHandler attachment) {

    }
}
