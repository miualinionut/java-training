package code._4_student_effort.AnimalHierarchy;

public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        System.out.println("for Fish d");
        d.eat();
        d.play();
        d.walk();
        System.out.println("for Cat c");
        c.eat();
        c.play();
        c.walk();
        System.out.println("for Fish a");
        a.eat();
        a.walk();
        System.out.println("for Spider e");
        e.eat();
        e.walk();
        System.out.println("for Cat p");
        p.setName("Bubbles");
        p.play();
    }
}
