package com.yinhd.designpattern.strategyPattern.nostatic_strategy;

import com.yinhd.designpattern.strategyPattern.Strategy;
import com.yinhd.designpattern.strategyPattern.static_strategy.StrategyA;
import com.yinhd.designpattern.strategyPattern.static_strategy.StrategyFactory;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-20 11:36
 **/
public class Strategytor {
    private static final List<StrategyRange> strategies = new ArrayList<>();

    static {
        strategies.add(new StrategyRange("A", StrategyFactory.getStrategy("A")));
        strategies.add(new StrategyRange("B", StrategyFactory.getStrategy("B")));
    }

    public void strategyDo(String type) {
        Strategy strategy = null;
        for (StrategyRange strategyRange : strategies) {
            if (strategyRange.isRange(type)) {
                strategy = strategyRange.getStrategy();
                break;
            }
        }
        assert strategy != null;
        strategy.algorithmInterface();
    }
}
