package code._4_student_effort;

public class TestAnimal {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Hello Kitty");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println(c.getName());
        d.play();
        p.play();
        e.walk();
        e.eat();
    }

}
