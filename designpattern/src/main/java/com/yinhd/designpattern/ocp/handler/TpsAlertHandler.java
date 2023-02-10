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
public class TpsAlertHandler extends AlertHandler{
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }
    @Override
    public void check(ApiStatInfo apiStatInfo) {
//        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
//        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
    }
}
