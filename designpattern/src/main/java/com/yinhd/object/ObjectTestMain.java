package com.yinhd.object;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-03-28 16:48
 **/
public class ObjectTestMain {
    public static void main(String[] args) {
        Example ex = new Example();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    ex.increment();
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    ex.increment();
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
