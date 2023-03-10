package com.spring.controller;

import com.spring.AutoWired;
import com.spring.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-13 17:28
 **/
@Controller
public class UserController {

    @AutoWired
    UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
