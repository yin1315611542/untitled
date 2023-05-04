package com.yinhd.designpattern.strategyPattern.static_strategy;

import com.yinhd.designpattern.strategyPattern.Strategy;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-20 10:43
 **/
public class StrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("策略A");
    }
}
