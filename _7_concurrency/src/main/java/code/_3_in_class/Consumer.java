package code._3_in_class;

public class Consumer extends Thread {
  private CommunicationChannel channel;

  public Consumer(CommunicationChannel channel) {
    this.channel = channel;
  }

  @Override
  public void run() {
    String msg = "0";
    String prev = msg;
    do {
      msg = channel.take();
      if(!msg.equals("DONE") && Integer.valueOf(msg) == Integer.valueOf(prev) + 1) {
        System.out.println("EEEEEE out of order");
      }
      System.out.println(msg);
    } while (!msg.equals("DONE"));

  }
}
