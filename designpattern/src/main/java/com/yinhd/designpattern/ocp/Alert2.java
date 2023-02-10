package com.yinhd.designpattern.ocp;

import com.yinhd.designpattern.ocp.common.ApiStatInfo;
import com.yinhd.designpattern.ocp.handler.AlertHandler;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 10:21
 **/
public class Alert2 {
    private List<AlertHandler> alertHandlers = new ArrayList<>();
    public void addAlertHandler(AlertHandler alertHandler){
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo){
        for (AlertHandler alertHandler : alertHandlers) {
            alertHandler.check(apiStatInfo);
        }
    }
}
