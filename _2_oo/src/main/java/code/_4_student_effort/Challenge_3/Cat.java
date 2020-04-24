package code._4_student_effort.Challenge_3;

public class Cat extends Animal implements Pet {
    protected String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this(null);
    }


    @Override
    public void eat() {
        System.out.println("Cats eat mice");
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
        System.out.println("Cats play with children");
    }
}
