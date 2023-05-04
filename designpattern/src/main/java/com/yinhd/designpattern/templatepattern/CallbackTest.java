package com.yinhd.designpattern.templatepattern;

import java.util.concurrent.CompletableFuture;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-19 16:45
 **/
public class CallbackTest {
    public static void main(String[] args) {
        Task task = new Task();
        task.execute(result -> System.out.println(result));
    }
}
