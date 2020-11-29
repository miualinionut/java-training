package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
            super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating");
    }

    @Override
    public void walk() {
        System.out.println("The fish can't walk");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("The fish " + name + " is playing");
    }
}
