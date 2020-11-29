package code._4_student_effort.animal_hierarchy;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat (String name, Integer legs) {
        super(legs);
        this.name = name;
    }

    public Cat () {
        this(" ", 4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("The cat " + this.name + " is playing");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats mice");
    }
}
