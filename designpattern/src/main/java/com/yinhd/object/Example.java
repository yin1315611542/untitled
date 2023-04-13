package com.yinhd.object;

public class Example {
    private Integer count = 0;

    public void increment() throws InterruptedException {
        Integer localCount = count;
        Thread.sleep(1);
        localCount++;
        count = localCount;
        System.out.println("Thread " + Thread.currentThread().getId() + " : Count is " + count);
    }
}
