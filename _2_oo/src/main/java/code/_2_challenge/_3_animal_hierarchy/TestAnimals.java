package code._2_challenge._3_animal_hierarchy;

public class TestAnimals {
  public static void main(String[] args) {
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();
  }
}
