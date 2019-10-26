package code._1_study._4_starvation;

public class StarvationExample {
  public static void main(String[] args) {
    OnePersonKitchen onePersonKitchen = new OnePersonKitchen();

    Person person1 = new Person("P1", onePersonKitchen);
    Person person2 = new Person("P2", onePersonKitchen);
    PersonThatNeverFinishesEating personThatNeverFinishesEating = new PersonThatNeverFinishesEating("P3", onePersonKitchen);

    person1.start();
    person2.start();
    personThatNeverFinishesEating.start(); //if 3 never stops eating, and others cannot enter the kitchen to start eating => others will starve
  }
}
