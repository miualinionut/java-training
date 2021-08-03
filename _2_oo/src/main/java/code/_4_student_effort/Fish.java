package code._4_student_effort;

public class Fish extends Animal implements Pet {
    private String name;
    public Fish() {

        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void walk() {
        System.out.println("Fish cannot walk");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish is playing");
    }
}
