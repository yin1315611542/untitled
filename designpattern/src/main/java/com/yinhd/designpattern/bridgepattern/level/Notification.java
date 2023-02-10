package com.yinhd.designpattern.bridgepattern.level;

import com.yinhd.designpattern.bridgepattern.msgsender.MsgSender;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 15:36
 **/
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender){
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
