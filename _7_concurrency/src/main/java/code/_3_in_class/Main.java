package code._3_in_class;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    CommunicationChannel channel = new CommunicationChannel();
    Producer producer = new Producer(channel);
    Consumer consumer = new Consumer(channel);

    consumer.start();
    producer.start();

    consumer.join();
    producer.join();
    System.out.println("FINISHED SIMULATION");
  }
}