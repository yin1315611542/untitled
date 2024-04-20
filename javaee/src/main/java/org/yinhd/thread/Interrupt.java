package org.yinhd.thread;


import java.io.IOException;

public class Interrupt {
    public static void main(String[] args) throws IOException, InterruptedException {
        TRunnable tRunnable = new TRunnable();
        Thread thread = new Thread(tRunnable);
        thread.start();

        //模拟到达一定进行执行thread的中断任务
        int count=0;
        while (count++%2==0){
            Thread.sleep(10000);
            thread.interrupt();
        }
        System.in.read();
    }
}


class TRunnable implements Runnable{
    @Override
    public void run() {
        /*线程未处于阻塞状态：使用 isInterrupted()判断线程的中断标志来退出循环。当使用
        interrupt()方法时，中断标志就会置 true，和使用自定义的标志来控制循环是一样的道理。
         */
        while (!Thread.currentThread().isInterrupted()){
            try {
                System.out.println("执行某些具体任务");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("线程中断");
                break;
            }
        }
    }
}

/**
 如使用了 sleep,同步锁的 wait,socket 中的 receiver,accept 等方法时，
 会使线程处于阻塞状态。当调用线程的 interrupt()方法时，会抛出 InterruptException 异常。
 阻塞中的那个方法抛出这个异常，通过代码捕获该异常，然后 break 跳出循环状态，从而让
 我们有机会结束这个线程的执行。通常很多人认为只要调用 interrupt 方法线程就会结束，实
 际上是错的， 一定要先捕获 InterruptedException 异常之后通过 break 来跳出循环，才能正
 常结束 run 方法。
 */