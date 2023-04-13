package com.example.jvm.xx;

import org.springframework.stereotype.Service;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-03-30 17:44
 **/
@Service
public class StackOverflowError {
//    栈空间虽然不是无限的，但一般正常调用的情况下是不会出现问题的。
//    不过，如果函数调用陷入无限循环的话，就会导致栈中被压入太多栈帧而占用太多空间，导致栈空间过深。
//    那么当线程请求栈的深度超过当前 Java 虚拟机栈的最大深度的时候，就抛出 StackOverFlowError 错误。

//    Java 方法有两种返回方式，一种是 return 语句正常返回，一种是抛出异常。不管哪种返回方式，都会导致栈帧被弹出。也就是说， 栈帧随着方法调用而创建，随着方法结束而销毁。无论方法正常完成还是异常完成都算作方法结束
//    除了 StackOverFlowError 错误之外，栈还可能会出现OutOfMemoryError错误，这是因为如果栈的内存大小可以动态扩展（以前的class虚拟机可以但是HotSpot不会由于虚拟机栈不足而扩展，所以不考虑此情况），
//    如果虚拟机在动态扩展栈时无法申请到足够的内存空间，则抛出OutOfMemoryError异常

    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String [] args) throws Throwable{
        StackOverflowError stackOverflowError = new StackOverflowError();
        stackOverflowError.stackLeak();
    }
}
