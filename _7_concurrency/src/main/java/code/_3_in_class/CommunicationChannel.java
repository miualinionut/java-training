package code._3_in_class;

public class CommunicationChannel {
  private volatile String message = null;
  private volatile Boolean isEmpty = true;

  public void put(String s) {
    while(!this.isEmpty) {}
    this.isEmpty = false;


    this.message = s;
  }

  public String take() {
    while(this.isEmpty) {}
    this.isEmpty = true;
    return this.message;
  }

}
