package com.example.jvm.test;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-13 15:59
 **/
public class ThreadlocalTest {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static ThreadLocal<Integer> getThreadLocal() {
        return threadLocal;
    }

    public static void setThreadLocal(ThreadLocal<Integer> threadLocal) {
        ThreadlocalTest.threadLocal = threadLocal;
    }

    public static void main(String[] args) {
        // 创建两个线程并启动
        new Thread(new MyRunnable(1)).start();
        new Thread(new MyRunnable(2)).start();
    }

    public static class MyRunnable implements Runnable {
        private int id;

        public MyRunnable(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                // 设置ThreadLocal变量的值
                threadLocal.set(id++);
                System.out.println("Thread " + Thread.currentThread().getName() + ", value = " + threadLocal.get() + " threadLocal:" + threadLocal.hashCode() +"");
                try {
                    // 线程休眠一段时间
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
