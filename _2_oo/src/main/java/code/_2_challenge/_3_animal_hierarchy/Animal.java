package code._2_challenge._3_animal_hierarchy;

public abstract class Animal {
  protected int legs;

  protected Animal(int legs) {
    this.legs = legs;
  }

  public abstract void eat();

  public void walk() {
    System.out.println("animal with " + legs + " legs is walking");
  }
}
