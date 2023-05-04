package com.yinhd.designpattern.strategyPattern;

import com.yinhd.designpattern.strategyPattern.Strategy;
import com.yinhd.designpattern.strategyPattern.nostatic_strategy.Strategytor;
import com.yinhd.designpattern.strategyPattern.static_strategy.StrategyFactory;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-20 09:48
 **/

public class StrategyPatternTest {
    public static void main(String[] args) {
        String type = "A";
        Strategy strategy = StrategyFactory.getStrategy(type);
        strategy.algorithmInterface();

        String type2 = "B";
        Strategy strategy2 = StrategyFactory.getStrategy(type2);
        strategy2.algorithmInterface();

        Strategytor strategytor = new Strategytor();
        strategytor.strategyDo(type);
    }

}
