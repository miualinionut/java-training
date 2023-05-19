package code._4_student_effort;

public class Main {

    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.print("Fish: ");
        d.eat();
        d.walk();
        c.setName("Tom");
        System.out.println(c.getName());
        c.eat();
        c.play();

        System.out.println("Fish: ");
        a.eat();
        a.walk();

        System.out.println("Spider: ");
        e.eat();
        e.walk();






    }
}
