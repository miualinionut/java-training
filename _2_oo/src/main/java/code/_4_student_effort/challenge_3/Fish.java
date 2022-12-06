package code._4_student_effort.challenge_3;

public class Fish extends Animal implements Pet{

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Eating fish food");
    }

    @Override
    public void walk() {
        System.out.println("Fish don't walk");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {}

    @Override
    public void play() {
        System.out.println("Fish don't play");
    }
}
