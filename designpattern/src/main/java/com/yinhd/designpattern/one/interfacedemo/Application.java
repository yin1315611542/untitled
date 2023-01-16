package com.yinhd.designpattern.one.interfacedemo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * @program: designpatterns
 * @description:
 * @Author: yinhd
 * @create: 2023-01-16 15:08
 **/
@Component
public class Application {
    @Resource
    private List<Filters> filters = new ArrayList<>();

    public void handleRpcRequest(String rpc){
        try {
            for (Filters filter: filters) {
                filter.doFilter(rpc);
            }
        }catch (Exception e){
            out.println(e.toString());
        }
    }
}
