package threadlocal;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-04-14 16:37
 **/
public class M {
        //对象回收时执行的方法
        @Override
        protected void finalize(){
            System.out.println("finalize");
        }
}


