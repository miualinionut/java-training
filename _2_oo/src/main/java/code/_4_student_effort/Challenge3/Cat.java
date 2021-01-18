package code._4_student_effort.Challenge3;

public class Cat extends Animal implements Pet {
    public String name;

    public Cat(String Name) {
        super(4);
        this.name = Name;
    }

    public Cat() {
        this(" ");
    }

    @Override
    public void eat() {
        System.out.println("Cat is Eating");
    }

    @Override
    public void walk() {
        super.walk();
    }
           //Pet Interface override methods
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
        System.out.println(this.name + " is playing.");
    }
}

