package code._4_student_effort.Challenge_3;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {

        this("");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing");
    }
}
