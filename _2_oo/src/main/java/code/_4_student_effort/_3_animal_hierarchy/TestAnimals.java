package code._4_student_effort._3_animal_hierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.getName();
        d.eat();
        d.setName("Fish 1");
        d.getName();
        d.walk();
        d.play();

        c.getName();
        c.eat();
        c.play();
        c.walk();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.play();
        p.getName();

        //casting
        ((Cat)p).walk();
        ((Fish)a).play();

        //polymorphism
        Animal a1 = new Fish();
        Fish d1 = new Fish();
        d1.walk();
        a1.walk();
    }
}
