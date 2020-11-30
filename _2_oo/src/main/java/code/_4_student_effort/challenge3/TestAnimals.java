package code._4_student_effort.challenge3;


public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish(0);
        Cat c = new Cat("Fluffy");
        Animal a = new Fish(0);
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        e.eat();
        e.walk();
    }
}
