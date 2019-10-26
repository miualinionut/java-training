package code._2_challenge._1_rabbit_race;

public class RabbitRunnable implements Runnable {
  private int nr;

  public RabbitRunnable(int nr) {
    this.nr = nr;
  }

  @Override
  public void run() {
    System.out.printf("Rabbit %s is running \n", nr);
  }
}