package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal implements Pet {
    private String name;

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish" + name + "eats.");
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
        System.out.println("Cat" + name + "plays.");
    }

    @Override
    public void walk() {
        System.out.println("Fish" + name + "can't walk.");
    }
}
