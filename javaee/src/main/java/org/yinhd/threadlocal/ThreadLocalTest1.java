package org.yinhd.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest1 {
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
    static Set<String> set = new HashSet();
    public static void main(String[] args) throws InterruptedException {
        ThreadLocalTest1 threadLocalTest1 = new ThreadLocalTest1();
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    String date =  threadLocalTest1.date(Long.parseLong(String.valueOf(finalI)));
                    System.out.println(date);
                    set.add(date);
                }
            });
        }
        Thread.sleep(5000);
        System.out.println(set.size());
    }
    public  String date(Long time){
        Date date = new Date(1000*time);
        SimpleDateFormat dateFormat = ThreadSafeFormatter.dateFormatThreadLocal.get();
        String format = dateFormat.format(date);
        return format;
    }
}


//为每个线程分配一个SimpleDateFormat，每个线程用自己的SimpleDateFormat处理（线程池有10个线程，为每个线程分配一个）
