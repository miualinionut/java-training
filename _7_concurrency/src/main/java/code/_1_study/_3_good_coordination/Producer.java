package code._1_study._3_good_coordination;

public class Producer extends Thread {

  private IChannel channel;

  public Producer(IChannel channel) {
    this.channel = channel;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      channel.put(String.valueOf(i));
    }
    channel.put("DONE");
  }
}
