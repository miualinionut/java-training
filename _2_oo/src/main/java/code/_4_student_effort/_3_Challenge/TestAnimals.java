package code._4_student_effort._3_Challenge;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        c.play();
        a.eat();
        e.walk();
        p.play();
    }
}
