package com.spring.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-15 11:05
 **/
@Component
public class Awares implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {
    private ApplicationContext applicationContext;
    //后置处理器
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的ioc:"+applicationContext);
        this.applicationContext = applicationContext;
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("name:"+name);
    }

    //解析
    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String s = resolver.resolveStringValue("你好${os.name},我是#{20*80}");
        System.out.println("解析的"+s);
    }
}
