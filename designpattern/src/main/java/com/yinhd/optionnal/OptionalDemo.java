package com.yinhd.optionnal;

import common.UserVo;

import java.util.Optional;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-02 13:52
 **/
public class OptionalDemo {
    public static void main(String[] args) {
        /*
        Optional 不能new 但他提供投给了三种创建方法
         */
        //empty 直接设置空值
        Optional<String> empty = Optional.empty();
        //of 如果传入的对象为null会抛出异常
        Optional<String> of = Optional.of("optional");
        //ofNullable 如果传入的对象为null则返回 empty
        Optional<String> o = Optional.ofNullable(null);
        Optional<String> optional = Optional.ofNullable("optional");

        UserVo userVo = new UserVo();
        userVo.setName("Xiaoming");
        userVo.setAge(18);
        /*
        公共方法
         */
        //1.ifPresent判断是否为空，有两个实现一个返回true/false,另一个为函数式编程
        Optional.ofNullable(userVo).ifPresent(e -> System.out.println(e.getAge()));
        //2.map 对象重定义
        Optional<Integer> integer1 = Optional.ofNullable(userVo).map(UserVo::getAge);
        //3.满足filter中的条件返回对象本身，否则返回empty
        Optional<UserVo> userVo2 = Optional.ofNullable(userVo).filter(e -> e.getAge().equals(12));
        //4.orElse 为空返回orElse中规定的值，不为空返回原值
        UserVo userVo3 = Optional.ofNullable(userVo).orElse(new UserVo());
        //5.orElseThrow 为空抛出异常
        UserVo userVo1 = Optional.ofNullable(userVo).orElseThrow(() -> new RuntimeException("a"));

        //使用案例
        //1.得到UserVo 名字转小写判断是否为xiaoming
        String name = Optional.ofNullable(userVo)
                .map(UserVo::getName)
                .map(String::toLowerCase)
                .filter("xiaoming"::equals)
                .orElseThrow(() -> new RuntimeException("不满足"));
    }
}
