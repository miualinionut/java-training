package code._1_study._1_contention;

import java.util.ArrayList;
import java.util.List;

public class ContentionExample {

  public static long v = 0;

  public static void main(String[] args) throws InterruptedException {
    long threadsNr = 5_000;
    List<MyThread> list = new ArrayList<>();
    for(int i=0;i<threadsNr;i++) {
      list.add(new MyThread());
    }

    //start all
    for (MyThread thread : list) {
      thread.start();
    }

    //wait for all
    for(MyThread thread: list) {
      thread.join();
    }

    System.out.println(v); //why is v not 5000000000 ?
    System.out.println(1_000_000L * threadsNr);
  }

}
