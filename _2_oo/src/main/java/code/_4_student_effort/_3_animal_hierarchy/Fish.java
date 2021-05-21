package code._4_student_effort._3_animal_hierarchy;

public class Fish extends Animal implements Pet {
    protected String name;

    public Fish() {
        super(0);
    }
    public Fish(String name) {
        super(0);
        this.name = name;
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
        System.out.println("The fish " + name + " is playing.");
    }

    @Override
    public void eat() {
        System.out.println("The fish " + name + " is eating aquatic plants.");
    }

    @Override
    public void walk() {
        System.out.println("The fish cannot walk!");
    }
}
