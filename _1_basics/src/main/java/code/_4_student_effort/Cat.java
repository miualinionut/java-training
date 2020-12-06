package code._4_student_effort;

public class Cat extends Animal implements Pet{

    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this(""); //calling the above constructor. I can write them in any order as this does not affect the chaining
    }

    @Override
    public void getName() {
        System.out.println("Name is " + this.name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
        System.out.println("New name is: " + this.name);
    }

    @Override
    public void play() {
        System.out.println(this.name +" plays.");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " ate.");
    }
}
