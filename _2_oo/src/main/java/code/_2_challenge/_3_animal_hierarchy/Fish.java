package code._2_challenge._3_animal_hierarchy;

public class Fish extends Animal implements Pet {
  private String name;

  public Fish() {
    super(0);
  }

  @Override
  public void eat() {
    System.out.println("fish is eating");
  }

  @Override
  public void walk() {
    System.out.println("fished cannot walk");
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void play() {
    System.out.println("fish is playing");
  }
}
