package org.yinhd.lock.synchronizeds;

public class SynchronizedMix {
    public static synchronized  void m1() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static synchronized void m2() {
        while (true) {
            synchronized (SynchronizedMix.class){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public synchronized void m3(){
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) throws InterruptedException {
        SynchronizedMix SynchronizedMix0 = new SynchronizedMix();
        SynchronizedMix SynchronizedMix1 = new SynchronizedMix();
        Thread[] threads = new Thread[3];

        threads[0] = new Thread(() -> {
            SynchronizedMix0.m1();
        }, "线程" + 0);
        threads[0].start();
        Thread.sleep(1000);

        threads[1] = new Thread(() -> {
            SynchronizedMix1.m2();
        }, "线程" + 1);
        threads[1].start();
        //由此可见 synchronized (SynchronizedMix.class){}与public static synchronized  void m1()是锁的类，只允许一个线程执行
        // 类中静态方法.

        threads[2] = new Thread(() -> {
            SynchronizedMix0.m3();
        }, "线程" + 2);
        threads[2].start();
        Thread.sleep(1000);

        threads[0].join();
        threads[1].join();
        threads[2].join();
        //非静态方法不受类锁的影响，因为是在实例对象上假的锁
    }
}
