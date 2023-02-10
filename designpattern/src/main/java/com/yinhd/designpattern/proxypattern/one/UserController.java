package com.yinhd.designpattern.proxypattern.one;

import common.UserVo;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 14:13
 **/
public class UserController implements IUserController{

    @Override
    public UserVo login(String telephone, String password) {
        System.out.println("登录");
        return new UserVo();
    }

    @Override
    public UserVo register(String telephone, String password) {
        System.out.println("注册");
        return new UserVo();
    }
}
