package code._1_study._2_lack_of_coordination;

public class LackOfCoordinationExample {
  public static void main(String[] args) {
    IChannel channel = new LackOfCoordinationChannel();

    new Consumer(channel).start();
    new Producer(channel).start();
  }


}
