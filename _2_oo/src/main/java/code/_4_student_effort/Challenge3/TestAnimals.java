package code._4_student_effort.Challenge3;

public class TestAnimals {
    public static void main(String[] args){
        Fish d = new Fish("BlueFish");
        Cat c = new Cat("Cookie");
        Animal a = new Fish("BlueFish");
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        d.play();

        a.walk();
        a.eat();

        c.eat();
        c.play();
        c.walk();

        e.eat();
        e.walk();



    }
}
