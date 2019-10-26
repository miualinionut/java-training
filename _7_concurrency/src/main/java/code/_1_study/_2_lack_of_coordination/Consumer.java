package code._1_study._2_lack_of_coordination;

public class Consumer extends Thread {

  private IChannel channel;

  public Consumer(IChannel channel) {
    this.channel = channel;
  }

  @Override
  public void run() {
    String previous = "0";
    String current = channel.take();
    while (!current.equals("DONE")) {
      System.out.println(current);

      if (Integer.valueOf(current) != Integer.valueOf(previous) + 1) {
        System.out.println("lack of coordination");
        System.exit(0);
      }

      previous = current;
      current = channel.take();
    }
  }

}
