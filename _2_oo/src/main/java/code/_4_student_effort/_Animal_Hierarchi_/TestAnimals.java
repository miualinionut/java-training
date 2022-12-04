package code._4_student_effort._Animal_Hierarchi_;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        p.setName("Muffy");
        System.out.println(p.getName());
        c.walk();
        c.play();
        d.play();
        d.walk();

    }
}
