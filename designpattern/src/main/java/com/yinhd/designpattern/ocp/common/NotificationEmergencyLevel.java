package com.yinhd.designpattern.ocp.common;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 09:27
 **/
public enum NotificationEmergencyLevel {
    URGENCY("URGENCY",1),
    SEVERE("URGENCY",2);

    private String name;
    private Integer code;

    NotificationEmergencyLevel(String name, Integer code) {
        this.name = name;
        this.code = code;
    }


}
