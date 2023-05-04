package juc;

import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        // 创建一个CompletableFuture对象，表示一个异步操作
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // 在另一个线程中执行异步操作，返回结果
            try {
                Thread.sleep(10000); // 模拟耗时操作
                return "异步操作完成";
            } catch (InterruptedException e) {
                return "异步操作失败：" + e.getMessage();
            }
        });

        // 注册一个回调函数，当异步操作完成后自动执行
        CompletableFuture<String> stringCompletableFuture = future.thenApply(result -> {
            return "异步操作结果：" + result;
        });
        CompletableFuture<String> stringCompletableFuture1 = future.thenApply(result -> {
            return "异步操作结果：" + result;
        });

        // 在这里可以执行一些其他的操作，不会阻塞异步线程
        // 等待异步操作完成

        String join = stringCompletableFuture.join();
        System.out.println(join);
        String join2 = stringCompletableFuture1.join();
        System.out.println(join2);
        String join1 = future.join();
        System.out.println(join1);
    }
}