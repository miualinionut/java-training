package code._4_student_effort._3_animal_hierarchy;

public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this(" ");
    }

    @Override
    public void eat() {
        System.out.println("Cat " + name + " has eaten.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Thou hast played with the cat " + name + "...");
    }
}
