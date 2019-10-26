package code._2_challenge._1_rabbit_race;

public class RabbitRaceChallenge {

  public static void main(String[] args) {
    RabbitRaceChallenge challenge = new RabbitRaceChallenge();
    challenge.race();
  }

  public Thread createThreadRabbit(int i) {
    return new RabbitThread(i);
  }

  public Thread createRunnableRabbit(int i) {
    RabbitRunnable runnable = new RabbitRunnable(i);
    return new Thread(runnable);
  }

  public Thread getCorrespondingRabbitImplementation(int startPosition) {
    return (startPosition % 2 == 0) ?
            createThreadRabbit(startPosition) :
            createRunnableRabbit(startPosition);
  }

  public void makeTheRabbitRun(Thread rabbit) {
    rabbit.start();
  }

  public void race() {
    for (int i = 0; i < 10; i++) {
      Thread rabbit = getCorrespondingRabbitImplementation(i);
      makeTheRabbitRun(rabbit);
    }
  }

}