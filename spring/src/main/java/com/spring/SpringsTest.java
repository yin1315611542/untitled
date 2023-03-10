package com.spring;

import com.spring.config.SpringConfig;
import com.spring.controller.UserController;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-13 17:24
 **/


public class SpringsTest {

    @Test
    public void test(){
        UserController userController = new UserController();
        Class<? extends UserController> aClass = userController.getClass();
        Stream.of(aClass.getDeclaredFields()).forEach(field->{
            AutoWired annotation = field.getAnnotation(AutoWired.class);
            if (annotation!=null){
                field.setAccessible(true);
                Class<?> type = field.getType();
                try {
                    Object o = type.newInstance();
                    field.set(userController,o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                System.out.println(userController.getUserService());
            }
        });
    }

    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

    @Conditional({})
    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }


}
