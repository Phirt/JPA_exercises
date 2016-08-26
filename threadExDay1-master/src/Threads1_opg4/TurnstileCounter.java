package Threads1_opg4;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class TurnstileCounter {

    private final ReentrantLock lock = new ReentrantLock();
    static final long DELAY_VAL = 10000;
    long count = 0;

    public long getValue() {
        return count;
    }

    public void incr() {
        count++;

    }

    // Opgave 4.1
    // Kan gøres threadsafe med synchronized variablen
    // Skrives således: Public synchronized void incr()
    
    // Opgave 4.2
    // Bliver threadsafe via AtomicInteger
    // private AtomicInteger c = new AtomicInteger(0);
    //  public long getValue() {
    //    return c.get();
    //  }
    //public void incr() {
    //  c.incrementAndGet();
    //}
    
    // Opgave 4.3
    // Udvidet version af synchronized. Hvordan det funger ved jeg ikke xD
    //    public void incr() {
    //        lock.lock();
    //        try {
    //            count++;
    //        } finally {
    //            lock.unlock();
    //        }
    //    }
}
