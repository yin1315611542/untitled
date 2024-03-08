package org.yinhd.lock.volatiles;

public class Demo {
    public volatile static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            int i = 0;
            while (!stop){
                i++;
            }
        });
        t1.start();
        System.out.println("开始");
        Thread.sleep(1000);
        stop = true;
    }
}
