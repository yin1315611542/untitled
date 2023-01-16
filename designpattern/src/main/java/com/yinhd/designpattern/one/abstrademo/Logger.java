package com.yinhd.designpattern.one.abstrademo;

import java.io.IOException;

/**
 * @program: designpatterns
 * @description:
 * @Author: yinhd
 * @create: 2023-01-16 11:39
 **/
public abstract class Logger {
    private String name;
    private boolean enabled;
    private Level minPermittedLevel;

    public Logger(String name, boolean enabled, Level minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
    }

    public void log(Level level, String message) throws IOException {
        boolean loggable = enabled&& (minPermittedLevel.code<level.code);
        if (!loggable){
            return;
        }
        doLog(level,message);
    }
    protected abstract void doLog(Level level,String message) throws IOException;
}
