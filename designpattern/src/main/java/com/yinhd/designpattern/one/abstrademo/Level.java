package com.yinhd.designpattern.one.abstrademo;

/**
 * @program: designpatterns
 * @description:
 * @Author: yinhd
 * @create: 2023-01-16 11:40
 **/
public enum Level {
    info("info",0),
    warning("warning",1),
    debug("debug",2);

    public String name;
    public Integer code;

    Level(String name, Integer code) {
        this.name = name;
        this.code = code;
    }
}
