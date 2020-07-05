package code._4_student_effort._1_dining_philosophers;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    private Lock lock = new ReentrantLock(true);

    public boolean lock() {
      lock.lock();
      return true;
    }

    public void unlock() {
      lock.unlock();
    }
  }