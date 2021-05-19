package code._4_student_effort.CodeChallenge3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        d.eat();
        d.play();
        d.setName("Nemo");
        System.out.println(d.getName());

        System.out.println("--------------------");

        System.out.println(c.getName());
        c.setName("Fluff");
        System.out.println(c.getName());
        c.walk();
        c.eat();
        c.play();

        System.out.println("--------------------");

        a.walk();
        a.eat();

        System.out.println("--------------------");

        e.walk();
        e.eat();

        System.out.println("--------------------");

        p.setName("Kitty");
        System.out.println(p.getName());
        p.play();
    }
}
