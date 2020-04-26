package code._4_student_effort._3_animal_hierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        System.out.println("-----------------");

        c.eat();
        c.play();
        System.out.println("-----------------");

        a.eat();
        a.walk();
        System.out.println("-----------------");

        e.eat();
        e.walk();
        System.out.println("-----------------");

        p.play();
        System.out.println("-----------------");

        Animal f = (Animal) c;
        f.walk();
        f.eat();


    }
}
