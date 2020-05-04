package code._4_student_effort.challenge3;


public class TestAnimals {

    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        d.eat();
        d.play();
        d.setName("Petrica");
        System.out.println(d.legs);
        System.out.println(d.getName());

        c.eat();
        c.walk();
        c.play();
        System.out.println(c.getName());
        System.out.println(c.legs);





    }
}
