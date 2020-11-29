package code._4_student_effort;

public class TestAnimals {

    public static void main(String args[]) {


        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.move();
        d.test();
        d.eat();
        System.out.println(d.getName());
        d.setName("testName");
        System.out.println(d.getName());


        e.move();
        e.eat();

        c.move();
        c.eat();
        System.out.println(c.getName());
        c.setName("testName2");
        System.out.println(c.getName());


        a.move();
        e.move();
        p.play();



    }
}
