package threadlocal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-14 17:18
 **/
//虚引用
public class PhantomReferenceTest {
    private static final List<Object> list = new LinkedList<>();
    private static final ReferenceQueue<M> referenceQueue= new ReferenceQueue<>();
    public static void main(String[] args) {
        PhantomReference<M> mPhantomReference = new PhantomReference<>(new M(), referenceQueue);
    }
}
