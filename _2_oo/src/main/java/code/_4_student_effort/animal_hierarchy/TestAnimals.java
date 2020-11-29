package code._4_student_effort.animal_hierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy", 4);
        Animal a = new Fish();
        Animal e = new Spider(8);
        Pet p = new Cat();

        a.eat();
        d.setName("Bob");
        System.out.println(d.getName());
        c.play();
    }
}
