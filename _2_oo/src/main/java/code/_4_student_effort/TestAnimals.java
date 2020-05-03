package code._4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Kitty");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.eat();
        d.play();
        d.walk();
        d.setName("Fishy");
        d.getName();
        c.eat();
        c.play();
        c.setName("Mitty");
        c.getName();
        a.eat();
        a.walk();
        p.play();
        p.setName("Reyna");
        p.getName();
    }
}