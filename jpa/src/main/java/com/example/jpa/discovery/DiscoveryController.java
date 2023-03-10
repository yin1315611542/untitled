package com.example.jpa.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-13 16:58
 **/
@RestController
@RequestMapping("aop")
public class DiscoveryController {

    @Autowired
    private DiscoveryService discoveryService;

    public DiscoveryService getDiscoveryService() {
        return discoveryService;
    }

    public void setDiscoveryService(DiscoveryService discoveryService) {
        this.discoveryService = discoveryService;
    }
    @GetMapping("/aop")
    public void test(){
        discoveryService.aspect();
    }

}
