package org.yinhd.lock.synchronizeds;

public class SynchronizedObject2 {
    public Object object = new Object();

    public void m1() {
        synchronized (object) {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public void m2() {
        synchronized (object) {
            while (true) {
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
        SynchronizedObject2 SynchronizedObject0 = new SynchronizedObject2();
        Thread[] threads = new Thread[3];
        threads[0] = new Thread(() -> {
            SynchronizedObject0.m1();
        }, "线程" + 0);
        threads[0].start();
        Thread.sleep(1000);

        threads[1] = new Thread(() -> {
            SynchronizedObject0.m2();
        }, "线程" + 1);
        threads[1].start();

        threads[0].join();
        threads[1].join();
    }
}
