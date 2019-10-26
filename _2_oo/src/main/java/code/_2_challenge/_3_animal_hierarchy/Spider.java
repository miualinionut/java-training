package code._2_challenge._3_animal_hierarchy;

public class Spider extends Animal {
  public Spider() {
    super(8);
  }

  @Override
  public void eat() {
    System.out.println("the spider eats");
  }
}
