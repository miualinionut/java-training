package code._4_student_effort.AnimalHierarchy;

public class TestAnimals
{

    public static void main(String[] args)
    {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        d.play();

        c.eat();
        c.walk();
        c.play();

        e.eat();
        e.walk();
    }
}
