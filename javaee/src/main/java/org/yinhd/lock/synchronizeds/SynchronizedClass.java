package org.yinhd.lock.synchronizeds;

public class SynchronizedClass {
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
            synchronized (SynchronizedClass.class){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedClass synchronizedClass0 = new SynchronizedClass();
        SynchronizedClass synchronizedClass1 = new SynchronizedClass();
        Thread[] threads = new Thread[3];

        threads[0] = new Thread(() -> {
            synchronizedClass0.m1();
        }, "线程" + 0);
        threads[0].start();
        Thread.sleep(1000);

        threads[1] = new Thread(() -> {
            synchronizedClass1.m2();
        }, "线程" + 1);
        threads[1].start();

        Thread.sleep(1000);

        threads[0].join();
        threads[1].join();
    }
}
