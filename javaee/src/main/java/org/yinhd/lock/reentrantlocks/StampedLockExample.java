package org.yinhd.lock.reentrantlocks;

import java.util.concurrent.locks.StampedLock;

public class StampedLockExample {
    private double x,y;
    private final StampedLock stampedLock = new StampedLock();
    void move (double x1,double y1){
        long stamped = stampedLock.writeLock();
        try {
            x = x+x1;
            y = y+y1;
        }finally {
            stampedLock.unlockWrite(stamped);
        }
    }
    double distanceFromOrigin(){
        long stamp = stampedLock.tryOptimisticRead();
        double currentX = x;
        double currentY = y;
        if(!stampedLock.validate(stamp)){
            long l = stampedLock.readLock();
            try {
                currentX = x;
                currentY = y;
            }finally {
                stampedLock.unlockRead(stamp);
            }
        }
      return Math.sqrt(currentX*currentX+currentY*currentY);
    }


}
