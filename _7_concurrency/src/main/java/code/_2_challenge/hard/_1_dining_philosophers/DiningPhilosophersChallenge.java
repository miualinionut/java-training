package code._2_challenge.hard._1_dining_philosophers;

import java.util.ArrayList;
import java.util.List;

public class DiningPhilosophersChallenge {

  public static void main(String[] args) {
    int oddNumber = 5;
    List<Chopstick> chopsticks = new ArrayList<>();
    List<Philosopher> philosophers = new ArrayList<>();

    for (int i = 0; i < oddNumber; i++) {
      chopsticks.add(new Chopstick());
    }

    for (int i = 0; i < oddNumber; i++) {
      philosophers.add(new Philosopher(String.valueOf(i + 1), chopsticks.get(i), chopsticks.get((i + 1) % oddNumber)));
    }

    for (Philosopher philosopher : philosophers) {
      philosopher.start();
    }
  }


}
