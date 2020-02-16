package code._4_student_effort.AnimalHierarchy;

public class Main {

    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        System.out.println(d.getLegs());

        c.eat();
        c.walk();
        System.out.println(c.getName());
        c.play();
        System.out.println(c.getLegs());

        a.eat();
        a.walk();
        System.out.println(a.getLegs());

        e.eat();
        e.walk();
        System.out.println(e.getLegs());

        p.play();


    }

}
