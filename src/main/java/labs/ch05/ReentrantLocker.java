package labs.ch05;

import java.util.concurrent.locks.ReentrantLock;

/**
 * __9__
 */
public class ReentrantLocker extends ReentrantLock implements AutoCloseable {
    private ReentrantLocker(){
        lock();
    }

    public ReentrantLocker getReentrantLocker(){
        ReentrantLocker newReentrantLocker=new ReentrantLocker();
        return newReentrantLocker;
    }

    @Override
    public void close()   {
        unlock();
    }
}
