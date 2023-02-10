package com.yinhd.designpattern.proxypattern.one;

import common.UserVo;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 14:11
 **/
public interface IUserController {
    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);
}
