package org.yinhd.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest2 {

    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
    static Set<String> set = new HashSet();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    public static void main(String[] args) throws InterruptedException {
        ThreadLocalTest2 threadLocalTest1 = new ThreadLocalTest2();
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
        String format = dateFormat.format(date);
        return format;
    }
}
//size()结果小于5000，说明多线程出错了
