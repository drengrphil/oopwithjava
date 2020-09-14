import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*; // Implements several lock implementation


class SimpleLock extends Thread{
    /*
     *
     * Lock is a synchronization mechanism like synchronized blocks
     */
    // Simple locking is to use synchronize block, which ensures that only one thread can execute that block of code at a time.
    private ReentrantLock lock = new ReentrantLock();
    // private int count = 0;
    public int inc(int valueIn, int threadID){
        int newCount = 0;
        lock.lock();
        try{
            newCount = ++valueIn;
            System.out.println("Thread "+ threadID + " changed count to: " + newCount);
        }finally{
            lock.unlock();
        }
        return newCount;
    }
}