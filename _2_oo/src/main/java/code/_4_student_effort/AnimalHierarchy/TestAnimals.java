package code._4_student_effort.AnimalHierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = (Pet) new Cat();

        System.out.println(d.getName());
        p.play();

    }
}
