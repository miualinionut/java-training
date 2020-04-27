package code._4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.setName("Nemo");
        System.out.println(d.getName());
        d.play();
        d.eat();
        d.walk();
        c.eat();
        c.walk();
        c.play();
        System.out.println(c.getName());
        c.setName("Purrlington");
        System.out.println(c.getName());
        a.eat();
        a.walk();
        e.walk();
        e.eat();
        System.out.println(p.getName());
        p.setName("Dumbo");
        System.out.println(p.getName());
        p.play();
    }
}
