package code._4_student_effort;

public class Fish extends Animal implements Pet {
    String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }
    public Fish() {
        super(0);
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
        System.out.println("Fish is playing");
    }

    public void walk() {
        System.out.println("Fish can't walk)");
    }
    public void eat() {
        System.out.println("Fish eats");
    }

}
