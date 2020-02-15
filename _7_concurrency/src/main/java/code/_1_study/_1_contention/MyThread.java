package code._1_study._1_contention;

import java.sql.Connection;

public class MyThread extends Thread {
  @Override
  public void run() {
    increment();
  }
//    private static synchronized void increment() {
//      for(int i = 1; i<= 1_000_000; i++){
//        ContentionExample.v++;
//      }
//    }

  private Object monitor;

  public MyThread(Object monitor) {
    this.monitor= monitor;
  }

private void increment() {
  synchronized (monitor) {
    for(int i = 1; i<= 1_000_000; i++){
      ContentionExample.v++;
    }
  }
}
  }
