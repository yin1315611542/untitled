package com.yinhd.designpattern.proxypattern.three;

import com.yinhd.designpattern.proxypattern.one.IUserController;
import com.yinhd.designpattern.proxypattern.one.UserController;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 14:27
 **/
public class test {
    public static void main(String[] args) {
        MetricsCollectorProxy metricsCollectorProxy = new MetricsCollectorProxy();
        IUserController proxy = (IUserController) metricsCollectorProxy.createProxy(new UserController());
        proxy.login("111","222");
    }
}
