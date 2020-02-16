package code._4_student_effort.AnimalHierarchy;

public class Fish extends Animal {

    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish is swimming not walking ( no legs, lol )");
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

}
