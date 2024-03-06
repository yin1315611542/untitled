package org.yinhd.lock.reentrantlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    static Lock lock = new ReentrantLock(true);
    private int count = 0;
    public void incr(){
        lock.lock();
        try {
            count++;
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        Thread[] threads = new Thread[2];
        for (int i = 0; i < 2; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    reentrantLockExample.incr();
                }
            });
            threads[i].start();
        }

        threads[0].join();
        threads[1].join();
        System.out.println(reentrantLockExample.count);
    }
}
