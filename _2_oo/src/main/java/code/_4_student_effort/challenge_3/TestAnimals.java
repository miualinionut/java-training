package code._4_student_effort.challenge_3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider(8);
        Pet p = new Cat("Fluffy");

        d.walk();
        c.play();
        a.eat();
        System.out.println(e.legs);
        System.out.println(p.getName());
        p.setName("Pisu");
        System.out.println(p.getName());
        a.walk();
    }
}
