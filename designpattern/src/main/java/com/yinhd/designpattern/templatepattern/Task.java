package com.yinhd.designpattern.templatepattern;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-19 16:39
 **/
public class Task {
    public void execute(Callback callback){
        callback.onCompleted("callbackTest");
    }
}
