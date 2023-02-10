package com.yinhd.designpattern.ocp.handler;

import com.yinhd.designpattern.ocp.AlertRule;
import com.yinhd.designpattern.ocp.Notification;
import com.yinhd.designpattern.ocp.common.ApiStatInfo;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 10:08
 **/
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
