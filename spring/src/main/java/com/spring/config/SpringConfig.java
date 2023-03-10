package com.spring.config;

import com.spring.condition.LinuxCondition;
import com.spring.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-14 13:51
 **/
@Configuration
@ComponentScan(value = "com.spring")

public class SpringConfig {
    @Bean
    @Scope //prototype 多实例 singleton （默认）单实例 request 同义词请求创建一个实例 session 同一个session创建一个实例
               //singleton 容器启动就会创建，用到对象就去拿；多实例 容器启动不创建对象，每次获取去创建对象
    @Lazy //懒加载 专门针对于单实例bean 容器启动不创建对象，第一次使用去创建对象 并进行初始化
    public UserService userService01(){
        return new UserService();
    }

    @Conditional(LinuxCondition.class)  //也可放到类上统一设置，该类下所有bean创建钱都应该满足Conditional中的条件
    @Bean
    public UserService userService02(){
       return new UserService();
    }

}
