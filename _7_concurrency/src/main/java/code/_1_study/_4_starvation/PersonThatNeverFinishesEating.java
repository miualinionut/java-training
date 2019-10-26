package code._1_study._4_starvation;

import static code._1_study._4_starvation.OnePersonKitchen.eat;

public class PersonThatNeverFinishesEating extends Person {
  public PersonThatNeverFinishesEating(String id, OnePersonKitchen onePersonKitchen) {
    super(id, onePersonKitchen);
  }

  @Override
  public void run() {
    synchronized (super.onePersonKitchen) {
      while (true) {
        System.out.println(super.id + " eating ...");
        eat();
        //onePersonKitchen.notifyAll(); never notifies that the kitchen is free, will just continue eating ...
      }
    }
  }
}