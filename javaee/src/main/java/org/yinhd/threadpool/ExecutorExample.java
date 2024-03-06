package org.yinhd.threadpool;

import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorExample {

    public static void main(String[] args) {
        //创建一个有固定线程数量的线程池，最大线程数等于核心线程数
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //创建只有一个线程的线程池，也就是说这个线程池只有一个核心线程
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        //该线程池不限制线程的数量，它会根据任务数量产生对应数量的线程，并且这些线程创建后会缓存起来，可以重复使用，直到任务数量降低之后被释放
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        //提供任务延迟，周期执行等功能
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        //基于ForkJoinPool，创建一个Fork/Join的线程池，实现任务拆分并行
        ExecutorService executorService3 = Executors.newWorkStealingPool();

    }


}
