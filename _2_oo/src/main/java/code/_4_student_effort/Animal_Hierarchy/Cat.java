package code._4_student_effort.Animal_Hierarchy;

public class Cat extends Animal implements Pet {
    private String nume;

    public Cat(String nume)
    {
        super(4);
        this.nume=nume;

    }

    public Cat()
    {
        this("");
    }

    @Override
    public void eat() {
        System.out.printf("Pisica mananca soareci.");
    }

    @Override
    public String getName() {
        return this.nume;
    }

    @Override
    public void setName(String name) {
        this.nume=name;
    }

    @Override
    public void play() {
        System.out.println("Pisica "+this.nume+" se joaca.");
    }
}
