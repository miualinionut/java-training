package code._1_study._3_good_coordination;

public class GoodCoordinationChannel implements IChannel {
  private String message;
  private boolean isChannelEmpty = true;

  public synchronized String take() {
    if (isChannelEmpty) {
      callWaitMethod();
    }
    isChannelEmpty = true;
    notifyAll();
    return message;
  }


  public synchronized void put(String message) {
    if (!isChannelEmpty) {
      callWaitMethod();
    }
    this.message = message;
    isChannelEmpty = false;
    notifyAll();
  }

  private void callWaitMethod() {
    try {
      this.wait();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}