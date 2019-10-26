package code._1_study._5_slow_loops;

import java.time.Duration;
import java.time.Instant;

public class SlowLoops {
  public static void main(String[] args) {
    loopUsingPrimitive();
    loopUsingWrapper();
  }

  private static void loopUsingWrapper() {
    Instant start2 = Instant.now();
    for (Integer i = 0; i < 10_000_000; i++) ;
    Instant stop2 = Instant.now();
    Duration duration2 = Duration.between(start2, stop2);
    System.out.println("using wrapper: " + duration2); //why is duration1 so different from duration2 ?
  }

  private static void loopUsingPrimitive() {
    Instant start1 = Instant.now();
    for (int i = 0; i < 10_000_000; i++) ;
    Instant stop1 = Instant.now();
    Duration duration1 = Duration.between(start1, stop1);
    System.out.println("using primitive: " + duration1);
  }
}