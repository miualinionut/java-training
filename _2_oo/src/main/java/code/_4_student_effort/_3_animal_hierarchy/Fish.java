package code._4_student_effort._3_animal_hierarchy;

public class Fish extends Animal implements Pet {
    String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public Fish() {
        this(" ");
    }

    public void eat() {
        System.out.println("Fish " + name + " has eaten some fishy stuff...");
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
        System.out.println("Your soaking wet hands have pet fish " + name + " ... mmm..");
    }

    @Override
    public void walk() {
        System.out.println("Fish " + name + " says: BRO I AM A FISH I CANT WALK...");
    }

}
