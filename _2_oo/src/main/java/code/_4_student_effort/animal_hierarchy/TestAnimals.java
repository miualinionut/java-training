package code._4_student_effort.animal_hierarchy;

public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        System.out.println(d.legs);

        c.eat();
        c.play();
        c.walk();
        System.out.println(c.getName());
        c.setName("new fluff");
        System.out.println(c.getName());
        System.out.println(c.legs);

        a.eat();
        a.walk();
        System.out.println(a.legs);

        e.eat();
        e.walk();
        System.out.println(e.legs);

        System.out.println(p.getName());
        p.setName("Kitty");
        System.out.println(p.getName());
        p.play();
    }
}
