package com.yinhd.designpattern.proxypattern.two;

import com.yinhd.designpattern.proxypattern.one.MetricsCollector;
import common.UserVo;
import org.omg.PortableInterceptor.RequestInfo;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 14:21
 **/

public class UserControllerProxy extends UserController {
    private MetricsCollector metricsCollector;

    public UserControllerProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public UserVo login(String telephone, String password) {
        UserVo userVo = super.login(telephone, password);
        metricsCollector.recordRequest();
        return userVo;
    }

    public UserVo register(String telephone, String password) {
        UserVo userVo = super.register(telephone, password);
        metricsCollector.recordRequest();
        return userVo;
    }
}

