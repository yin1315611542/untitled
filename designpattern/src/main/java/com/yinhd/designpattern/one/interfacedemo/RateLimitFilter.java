package com.yinhd.designpattern.one.interfacedemo;

import org.springframework.stereotype.Component;

/**
 * @program: designpatterns
 * @description:
 * @Author: yinhd
 * @create: 2023-01-16 15:07
 **/
@Component
public class RateLimitFilter implements Filters{
    @Override
    public void doFilter(String req) {
        System.out.println("限流过滤器");
    }
}
