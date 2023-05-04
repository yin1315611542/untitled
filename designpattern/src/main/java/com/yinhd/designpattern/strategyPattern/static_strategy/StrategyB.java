package com.yinhd.designpattern.strategyPattern.static_strategy;

import com.yinhd.designpattern.strategyPattern.Strategy;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-20 10:44
 **/
public class StrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("策略B");
    }
}
