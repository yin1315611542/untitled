package com.yinhd.designpattern.bridgepattern.level;

import com.yinhd.designpattern.bridgepattern.msgsender.MsgSender;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 15:41
 **/
public class UrgencyNotification extends Notification{
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send("222");
    }
}
