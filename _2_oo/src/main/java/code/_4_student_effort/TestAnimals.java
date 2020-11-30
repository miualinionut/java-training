package code._4_student_effort;

abstract class Animal {
    protected int legs;

    protected Animal(int legs) { this.legs = legs; }

    public abstract void eat();

    public void walk() { System.out.println("This animal walks with " + legs + " legs."); }
}

interface Pet {
    public String getName();

    public void setName( String name );

    public void play();
}

class Spider extends Animal{

    public Spider() { super(8); System.out.println("New spider in your house.");}

    @Override
    public void eat() {
        System.out.println("The spider eats bugs.");
    }
}

class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name) {
        super(4);
        System.out.println("New cat in your house.");
        this.name = name;
        super.walk();
    }

    public Cat() { this(""); }

    @Override
    public void eat() { System.out.println("The cat eats cat food."); }

    @Override
    public String getName() { return name; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void play() {
        System.out.println("The cat plays with cat toys.");
    }
}

class Fish extends Animal implements Pet {

    private String name;

    public Fish(String name) {
        super(0);
        System.out.println("New fish in your house.");
        this.name = name;
    }

    public Fish() {
        this("");
    }

    @Override
    public void eat() { System.out.println("The cat eats fish food."); }

    @Override
    public String getName() { return name; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void play() {
        System.out.println("The fish can't play, just floats around.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("The fish can't walk");
    }
}

public class TestAnimals {

    public static void main(String[] args) {
        Fish   d = new Fish();
        Cat    c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal b = new Spider();
        Pet    p = new Cat();

        System.out.println();
        d.walk();
        System.out.println(c.getName());
        b.walk();

    }
}
