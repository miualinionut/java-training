package code._4_student_effort._3_animal_hierarchy;

public class Cat extends Animal implements Pet {

    protected String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
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
        System.out.println("The cat " + name + " is playing with a toy.");
    }

    @Override
    public void eat() {
        System.out.println("The cat " + name + " is eating Whiskas.");
    }
}
