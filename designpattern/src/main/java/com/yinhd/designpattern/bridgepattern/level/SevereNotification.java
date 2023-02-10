package com.yinhd.designpattern.bridgepattern.level;

import com.yinhd.designpattern.bridgepattern.msgsender.MsgSender;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 15:39
 **/
public class SevereNotification extends Notification{
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send("发送");
    }
}
