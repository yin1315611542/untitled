package com.example.jvm.test;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-14 16:32
 **/
public class M {

    //
    @Override
    protected void finalize(){
        System.out.println("finalize");
    }
}
