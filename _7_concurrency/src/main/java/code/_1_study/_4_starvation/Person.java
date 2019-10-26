package code._1_study._4_starvation;

import static code._1_study._4_starvation.OnePersonKitchen.eat;

public class Person extends Thread {
  protected OnePersonKitchen onePersonKitchen;
  protected String id;

  public Person(String id, OnePersonKitchen onePersonKitchen) {
    super(id);
    this.id = id;
    this.onePersonKitchen = onePersonKitchen;
  }

  @Override
  public void run() {
    while (true) {
      synchronized (onePersonKitchen) {
        System.out.println(id + " eating ...");
        eat();
        System.out.println(id + " finished eating");
        onePersonKitchen.notifyAll(); //notify others that the kitchen is free now
        waitToBeNotifiedThatKitchenIsOpen();
      }
    }
  }

  private void waitToBeNotifiedThatKitchenIsOpen() {
    try {
      onePersonKitchen.wait();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}