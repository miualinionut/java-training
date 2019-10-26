package code._1_study._9_executors;

import java.util.concurrent.*;

public class ExecutorsExample {

  public static void main(String[] args) {
    int corePoolSize = 2;
    int maximumPoolSize = corePoolSize;
    long keepAliveTime = 0;
    TimeUnit unit = TimeUnit.SECONDS; //the time unit for the {@code keepAliveTime} argument
    BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(10);

    ExecutorService executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);

    for (int i = 1; i <= 10; i++) {
      executor.execute(new Task("task" + i));
    }
  }
}
