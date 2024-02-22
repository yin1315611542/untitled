/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-19 15:39
 **/
package com.yinhd.designpattern.strategyPattern;
//策略模式
//策略模式是指在策略的定义、创建、使用这三个部分进行解耦，通常利用此模式来避免冗长的if-else分支判断，是一种基于组合的行为模式。
//
// 具体来说
//策略的定义
//策略的创建
//策略的使用

// static_strategy 静态策略
// 事先创建好每个策略对象，缓存到工厂类中，用的时候直接返回。