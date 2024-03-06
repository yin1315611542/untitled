package com.yinhd.designpattern.strategyPattern;

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
        // 这里的“运行时动态”指的是，我们事先并不知道会使用哪个策略，而是在程序运行期间，根据配置、用户输入、计算结果生成的type等这些不确定因素，动态决定使用哪种策略
        String type = "A";
        Strategy strategy = StrategyFactory.getStrategy(type);
        strategy.algorithmInterface();

        String type2 = "B";
        Strategy strategy2 = StrategyFactory.getStrategy(type2);
        strategy2.algorithmInterface();

        //策略器的方式，直接引入一个策略器，由策略器进行策略的选择以及策略的执行
        Strategytor strategytor = new Strategytor();
        strategytor.strategyDo(type);
    }

}
