package com.yinhd.designpattern.proxypattern.one;

import common.UserVo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 14:14
 **/
public class UserControllerProxy implements IUserController{
    @Resource
    private UserController userController;
    @Resource
    private MetricsCollector metricsCollector;
    @Override
    public UserVo login(String telephone, String password) {
        UserVo login = userController.login(telephone,password);
        metricsCollector.recordRequest();
        return login;
    }

    @Override
    public UserVo register(String telephone, String password) {
        UserVo register = userController.register(telephone, password);
        metricsCollector.recordRequest();;
        return register;
    }
}
