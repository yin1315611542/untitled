package com.yinhd.designpattern.ocp;

import com.yinhd.designpattern.ocp.common.NotificationEmergencyLevel;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 09:13
 **/

public class Alert {
    private AlertRule rule;
    private Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
//        if (tps > rule.getMatchedRule(api).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
//        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
    }


    /**
     * 如果要在增加一个功能，比如每秒钟接口超时请求个数，超过某个某个阈值触发告警，怎么改动？
     * 1.check 接口增加参数 timeoutCount 超时接口请求数
     * 2.check 添加if判断
     */

    // 改动一：添加参数timeoutCount
    public void check(String api, long requestCount, long errorCount, long timeoutCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
//        if (tps > rule.getMatchedRule(api).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
//        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
        // 改动二：添加接口超时处理逻辑
        long timeoutTps = timeoutCount / durationOfSeconds;
//        if (timeoutTps > rule.getMatchedRule(api).getMaxTimeoutTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
    }

    /**
     * 这样修改 一方面,我们对所有调用check方法的地方都要进行修改，并且，由于修改check逻辑，测试有必要为用到车check方法的功能进行重新测试
     */

    //使用开闭原则 如何避免？？？
    /**
     * 首先入参的变化是不可避免的 可以将这些参数抽象出来 ApiStatInfo
     * 引入处理器的概念，将if判断逻辑分散在各个handler中
     * 见 Alert2
     */
}




