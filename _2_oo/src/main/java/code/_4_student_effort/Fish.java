package code._4_student_effort;

public class Fish extends Animal implements Pet {

    String name;
    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish ate a good meal");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The fish is playing with you. How cute");
    }
    public void walk()
    {
        System.out.println("The fish is swimming in water");
    }

    public void walkingFish()
    {
        super.walk();
    }

}