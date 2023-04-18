package threadlocal;

import java.lang.ref.WeakReference;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-14 17:14
 **/
public class WeekReferenceTest {
    public static void main(String[] args) {
        M m = new M();
        WeakReference weakReference = new WeakReference<>(m);

//        WeakReference weakReference = new WeakReference<>(new M());

        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());
    }
      //比较 WeakReference weakReference = new WeakReference<>(new M());
      // 和
      //    M m = new M();
      //     WeakReference weakReference = new WeakReference<>(m);
      //结果执行结果有什么不同？
      // 见博客 -- ThreadLocal
}
