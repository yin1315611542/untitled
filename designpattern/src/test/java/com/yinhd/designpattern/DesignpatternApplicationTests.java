package com.yinhd.designpattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.ref.SoftReference;
import java.util.Arrays;

@SpringBootTest
class DesignpatternApplicationTests {

    @Test
    void contextLoads() {
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(softReference.get());
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(softReference.get());

        byte[] b = new byte[1024*1024*1];
        System.out.println(softReference.get());
    }

}
