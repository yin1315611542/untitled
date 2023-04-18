package com.yinhd.threadlocal;

import java.lang.ref.SoftReference;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-14 17:02
 **/
public class Soft {
    public static void main(String[] args) {
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(softReference.get());
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(softReference.get());

        byte[] b = new byte[1024*1024*20];
        System.out.println(softReference.get());
    }
}
