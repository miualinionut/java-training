package code._2_challenge.hard._1_dining_philosophers;

public class Philosopher extends Thread {
    private String name;
    private Chopstick left, right;

    public Philosopher(String name, Chopstick left, Chopstick right) {
      super(name);
      this.name = name;
      this.left = left;
      this.right = right;
    }

    @Override
    public void run() {
      while (true) {
        if (left.lock()) {
          if (right.lock()) {
            eat();
            sleep();
            right.unlock();
          }
          left.unlock();
        }
      }
    }

    private void sleep() {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    private void eat() {
      System.out.println(name + " is eating");
    }
  }