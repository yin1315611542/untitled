package com.example.jvm.controller;

import com.example.jvm.multdatasource.AssetMapper;
import com.example.jvm.multdatasource.SourceDetailDO;
import com.example.jvm.multdatasource.User;
import com.example.jvm.multdatasource.UserMapper;
import com.example.jvm.xx.StackOverflowError;
import com.example.jvm.xx.XXFastThrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-03-30 10:11
 **/
@RestController
@RequestMapping("/xx")
public class XXController {
    @Autowired
    XXFastThrow xxFastThrow;
    @Autowired
    StackOverflowError stackOverflowError;
    @Autowired
    AssetMapper assetMapper;
    @Autowired
    UserMapper userMapper;

    @GetMapping("/fastThrow")
    public void FastThrow(){
        xxFastThrow.outOfMemory();
    }

    @GetMapping("/stackOver")
    public void stackOver(){
        stackOverflowError.stackLeak();
    }

    @GetMapping("/asset")
    public void getAsset(){
        List<SourceDetailDO> sourceDetailDO = assetMapper.selectList(null);
        System.out.println(sourceDetailDO);
    }

    @GetMapping("/user")
    public void getUser(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
