package code._4_student_effort;

public class Cat extends Animal implements Pet {

    String name;
    protected Cat(String name) {
        super(4);
        this.name = name;
    }

    protected Cat()
    {
        this("");
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Catto plays with ball. She thinks you're annoying");
    }

    @Override
    public void eat() {
        System.out.println("nomnomnomnomnomnom. Meow");
    }

}