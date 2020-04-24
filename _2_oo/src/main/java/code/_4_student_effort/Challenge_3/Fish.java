package code._4_student_effort.Challenge_3;

public class Fish extends Animal implements Pet {
    protected String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public Fish() {
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk");
    }

    @Override
    public void eat() {
        System.out.println("Fish eat algae");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish don't play");
    }
}
