package code._4_student_effort.Animal_Hierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        d.setName("Golden");
        d.getName();
        d.play();

        c.eat();
        c.walk();
        c.getName();
        c.play();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.getName();
        p.setName("Ugly");
        p.play();
    }
}
