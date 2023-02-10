/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 09:13
 **/
package com.yinhd.designpattern.ocp;

/**
 * 告警功能
 * 首先需要一个AlertRule定义告警规则，Notification定义告警通知类
 *
 * 修改代码就意味着违背开闭原则吗？？
 * --非  只要没有破坏代码的正常运行，没有破坏原有的单元测试 就可以说是一个合格的代码改动
 *
 * 如何做到？？？
 * 识别出可变部分和不可变部分 将可变部分封装起来 提供抽象化的不可变接口
 **/


