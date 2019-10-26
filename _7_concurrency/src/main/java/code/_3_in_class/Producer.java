package code._3_in_class;

public class Producer extends Thread {
  private CommunicationChannel channel;

  public Producer(CommunicationChannel channel) {
    this.channel = channel;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      channel.put(String.valueOf(i));
    }
    channel.put("DONE");
  }

}
