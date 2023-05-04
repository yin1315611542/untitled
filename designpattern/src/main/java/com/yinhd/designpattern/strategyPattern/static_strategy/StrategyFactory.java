package com.yinhd.designpattern.strategyPattern.static_strategy;

import com.yinhd.designpattern.strategyPattern.Strategy;
import com.yinhd.designpattern.strategyPattern.static_strategy.StrategyA;
import com.yinhd.designpattern.strategyPattern.static_strategy.StrategyB;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-20 10:40
 **/
public class StrategyFactory {
    private static final Map<String, Strategy> strategies =  new HashMap<>();
    static {
        strategies.put("A",new StrategyA());
        strategies.put("B",new StrategyB());
    }
    public static Strategy getStrategy(String type){
        if (type == null || type.isEmpty()){
            throw new IllegalArgumentException("type should not be empty");
        }
        return strategies.get(type);
    }
}
