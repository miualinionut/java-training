package code._1_study._9_executors;

public class Task implements Runnable {

  private String name;

  public Task(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(name + " calling database #" + i);
      simulateLongDatabaseCall();
    }
  }

  private void simulateLongDatabaseCall() {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
