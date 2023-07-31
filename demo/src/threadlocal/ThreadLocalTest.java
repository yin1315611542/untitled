package threadlocal;

import java.io.IOException;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-14 17:33
 **/
public class ThreadLocalTest {
    public static void main(String[] args) throws IOException {
//        M m = new M();
//        m = null;
//        System.gc();
//        System.in.read();
        String str = "SA";
        if (str.contains("S")){
            System.out.printf("S");
        }
    }
}
