package org.yinhd.lock.synchronizeds;

public class AtomicExample {
    volatile int i = 0;
    //对比去掉synchronized的执行结果
    public synchronized void incr(){
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicExample atomicExample = new AtomicExample();
        Thread[] threads = new Thread[2];
        for (int i=0;i<2;i++){
            threads [i] = new Thread(()->{
                for (int k = 0;k<1000;k++){
                    atomicExample.incr();
                }
            });
            threads[i].start();
        }
        threads[0].join();
        threads[1].join();
        System.out.println(atomicExample.i);
    }
}
