package com.yinhd.listener;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-06 16:08
 **/
@SpringBootApplication
public class ListenerTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyAsyncEventListener.class);
        context.refresh();
        context.close();
    }

    @EnableAsync
    public static class MyAsyncEventListener {
        @EventListener(ContextRefreshedEvent.class)
        @Async
        public boolean onContextRefreshedEvent(ContextRefreshedEvent event) {
            String name = Thread.currentThread().getName();
            System.out.println("[线程" + name + "]" + "+MyAsyncEventListener:" + event.getClass().getSimpleName());
            return true;
        }
    }
}
