package org.yinhd.lock.reentrantlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockExample {
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();
    private List<String> dataList = new ArrayList<>();

    public void setDataList(String data){
        writeLock.lock();
        try {
            dataList.add(data);
        }finally {
            writeLock.unlock();
        }
    }

    public String getDataList(int index) {
        readLock.lock();
        try {
           return dataList.get(index);
        }finally {
            readLock.unlock();
        }
    }
}

/**
 * ReentrantReadWriteLock锁有一个问题，如果当前有线程在调用get()方法，那么所有调用add()方法
 * 的线程必须要等待调用get()方法的线程释放锁之后才能写，也就是说在读的过程中不允许写。而如果访问get()
 * 方法的线程非常多，就会导致写线程一直被阻塞.为了解决ReentrantReadWriteLock中的这个潜在问题，
 * 在Java 8中引入了StampedLock机制，相比于ReentrantReadWriteLock，它优化了读锁、写锁的访问，
 * 简单来说，StampedLock提供了一种乐观锁策略，当有线程调用get()方法读取数据时，不会阻塞准备执行写操作的线程，具体见StampedLock。
 */
