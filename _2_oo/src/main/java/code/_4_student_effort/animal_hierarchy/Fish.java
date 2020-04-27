package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal implements Pet{

    protected String name;

    public Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("Fish eating fish food.");
    }

    @Override
    protected void walk() {
        System.out.println("Fish can't walk.");
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
        System.out.println("Fish playing.");
    }
}
