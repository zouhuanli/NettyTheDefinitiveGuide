package io.github.zouhuanli.others;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        // 初始化 Semaphore，指定容量为 5
        Semaphore semaphore = new Semaphore(5);

        // 调用 release 方法释放 6 个许可证
        for (int i = 0; i < 6; i++) {
            semaphore.release();
            System.out.println("Released a permit, available permits: " + semaphore.availablePermits());
        }

        for (int i=0; i<11; i++){
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Acquired a permit, available permits: " + semaphore.availablePermits());
        }
    }
}


