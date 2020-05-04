package code._4_student_effort;

public class Cat extends Animal implements Pet{
    String name;

    public Cat (String name) {
        super(4);
        this.name = name;
    }
    public Cat () {
        this("");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Cat is playing");
    }

    void eat() {
        System.out.println("Cat is eating ");
    }
}
