package code._4_student_effort.Challange3;

public class TestAnimals {
    public static void main(String args[])
    {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();


        d.setName("Gold Fish");
        System.out.println(d.getName());
        d.play();
        d.eat(10);
        System.out.println(d.getBelly());
        d.walk();
        System.out.println("");

        System.out.println(c.getName());
        c.play();
        c.eat(10);
        System.out.println(c.getBelly());
        c.walk();
        System.out.println("");

        a.eat(10);
        System.out.println(a.getBelly());
        a.walk();
        System.out.println("");

        e.eat(10);
        System.out.println(e.getBelly());
        e.walk();
        System.out.println("");

        p.setName("Ducesa");
        System.out.println(p.getName());
        p.play();
        System.out.println("");
    }
}
