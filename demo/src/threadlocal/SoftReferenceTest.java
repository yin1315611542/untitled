package threadlocal;

import java.lang.ref.SoftReference;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-14 17:06
 **/

public class SoftReferenceTest {
    public static void main(String[] args) {
        //软引用 内存够用时能被回收，内存不够使不能回收
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(softReference.get());
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(softReference.get());
        byte[] b = new byte[1024*1024*15];
        System.out.println(softReference.get());
    }
}
