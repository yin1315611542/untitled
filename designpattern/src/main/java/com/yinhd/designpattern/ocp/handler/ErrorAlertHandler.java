package com.yinhd.designpattern.ocp.handler;

import com.yinhd.designpattern.ocp.AlertRule;
import com.yinhd.designpattern.ocp.Notification;
import com.yinhd.designpattern.ocp.common.ApiStatInfo;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 10:09
 **/
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
//        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
    }
}
