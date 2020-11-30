package code._4_student_effort.AnimalHierarchy;

public class Fish extends Animal implements Pet {
    String name;

    public Fish() {
        super(0);
    }

    @Override

    public void eat() {
        System.out.println("fish eats");
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("fish plays");
    }

    @Override
    public void walk() {
        System.out.println("fish cannot walk and don't have legs");
    }
}
