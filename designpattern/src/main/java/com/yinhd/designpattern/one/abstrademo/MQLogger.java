package com.yinhd.designpattern.one.abstrademo;

/**
 * @program: designpatterns
 * @description:
 * @Author: yinhd
 * @create: 2023-01-16 14:41
 **/
public class MQLogger extends Logger{
    private final String client;

    public MQLogger(String name, boolean enabled, Level minPermittedLevel, String client) {
        super(name, enabled, minPermittedLevel);
        this.client = client;
    }

    @Override
    protected void doLog(Level level, String message) {
        System.out.println("输出到mq");
    }
}
