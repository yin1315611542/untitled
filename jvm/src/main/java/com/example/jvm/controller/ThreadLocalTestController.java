package com.example.jvm.controller;

import com.example.jvm.test.ThreadlocalTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-13 16:02
 **/
@RestController
@RequestMapping("/threadLocal")
public class ThreadLocalTestController {

    @GetMapping("demo1")
    public void demo1() {
        // 创建两个线程并启动
        ThreadlocalTest.MyRunnable myRunnable = new ThreadlocalTest.MyRunnable(1);
        ThreadlocalTest.MyRunnable myRunnable1 = new ThreadlocalTest.MyRunnable(1);
        ThreadlocalTest threadlocalTest = new ThreadlocalTest();
        System.out.println(myRunnable.hashCode());
        System.out.println(myRunnable1.hashCode());

        System.out.println(ThreadlocalTest.getThreadLocal().hashCode());

        new Thread(myRunnable).start();
        new Thread(myRunnable1).start();
    }
}
