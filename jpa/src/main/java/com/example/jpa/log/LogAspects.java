package com.example.jpa.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-15 14:06
 **/
//切面类
@Component
@Aspect
public class LogAspects {

    @Pointcut("execution(public void com.example.jpa.discovery.DiscoveryService.aspect())")
    public void pointCut(){
    }
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("运行前 name"+name);
    }
    //后置通知，无论是否正常结束
    @After("pointCut()")
    public void logEnd() {
        System.out.println("运行结束");
    }
    @AfterReturning("pointCut()") //正常返回
    public void logReturn(){
        System.out.println("正常运行返回");
    }
    @AfterThrowing("pointCut()") //异常返回
    public void logException(){

    }
}
