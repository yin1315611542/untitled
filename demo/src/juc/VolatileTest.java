package juc;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-18 14:45
 **/
public class VolatileTest {
    public volatile boolean mark = true;
    void m(){
        while (true){
            System.out.println("m:"+mark);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest volatileTest = new VolatileTest();
        new Thread(()->{
            volatileTest.m();
        }).start();
        TimeUnit.SECONDS.sleep(1);
        volatileTest.mark = false;
    }
    // volatile 保证变量可见性
    // 在多个线程操作同一个变量时，会将此变量复制到自己的栈中进行运算，然后返给变量本身，对于上边的例子，当新建的用户线程拿到mark值之后，此时的mark值为true，
    // 又因为此线程的逻辑是永不停止的，因此不会重新去拿mark的值，因此一直保存栈中Mark值,即使主线程修改了此值，用户线程也不会知道.而添加volatile之后，
    // 当某个线程修改了Mark值，会通知其他线程如果再用到mark值时要重新读取
    // 在Java中，当主线程中启动一个新的线程时，这个新线程属于用户线程，不是守护线程。因此，只要这个新线程没有结束，即使主线程结束了，这个新线程仍然会继续执行。

}
