package com.yinhd.designpattern.one.interfacedemo;

import org.springframework.stereotype.Component;

/**
 * @program: designpatterns
 * @description:
 * @Author: yinhd
 * @create: 2023-01-16 15:03
 **/
@Component
public class AuthenticationFilter implements Filters{
    @Override
    public void doFilter(String req) {
        System.out.println("鉴权过滤器");
    }
}
