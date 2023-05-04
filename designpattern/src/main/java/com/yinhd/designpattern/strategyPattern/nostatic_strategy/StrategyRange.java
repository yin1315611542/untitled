package com.yinhd.designpattern.strategyPattern.nostatic_strategy;

import com.yinhd.designpattern.strategyPattern.Strategy;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-20 14:04
 **/
public class StrategyRange {
    private String type;
    private Strategy strategy;

    public StrategyRange(String type, Strategy strategy) {
        this.type = type;
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
    public boolean isRange(String type){
        return type.equals(this.type);
    }
}
