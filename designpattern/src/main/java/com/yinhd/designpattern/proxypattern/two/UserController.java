package com.yinhd.designpattern.proxypattern.two;

import com.yinhd.designpattern.proxypattern.one.IUserController;
import common.UserVo;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 14:13
 **/
public class UserController  {

    public UserVo login(String telephone, String password) {
        System.out.println("登录");
        return new UserVo();
    }

    public UserVo register(String telephone, String password) {
        System.out.println("注册");
        return new UserVo();
    }
}
