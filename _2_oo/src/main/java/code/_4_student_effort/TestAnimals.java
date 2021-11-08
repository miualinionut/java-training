package code._4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        //Methods for obj d
        System.out.println("*** Method testing for obj d ***");
        d.walk();
        d.eat();
        System.out.println(d.getName());
        d.play();
        d.setName("Sasha");
        System.out.println(d.getName());
        //Methods for obj c
        System.out.println("*** Method testing for obj c ***");
        c.walk();
        c.eat();
        System.out.println(c.getName());
        c.play();
        c.setName("Jerry");
        System.out.println(c.getName());
        //Methods for obj a
        System.out.println("*** Method testing for obj a ***");
        a.walk();
        a.eat();
        //Methods for obj e
        System.out.println("*** Method testing for obj e ***");
        e.walk();
        e.eat();
        //Methods for obj p
        System.out.println("*** Method testing for obj p ***");
        System.out.println(p.getName());
        p.setName("Sasha");
        System.out.println(p.getName());
        p.play();
    }
}
