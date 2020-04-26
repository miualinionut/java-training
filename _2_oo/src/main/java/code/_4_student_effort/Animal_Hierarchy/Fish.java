package code._4_student_effort.Animal_Hierarchy;

public class Fish extends Animal implements Pet {
    private String nume;

    public Fish()
    {
        super(0);
    }

    @Override
    public void eat() {

        System.out.println("Pestele mananca");
    }

    @Override
    public void walk() {

        System.out.println("Pestele "+this.nume+" nu poate merge");
    }

    @Override
    public String getName() {
        return this.nume;
    }

    @Override
    public void setName(String name) {

        this.nume = name;
    }

    @Override
    public void play() {
        System.out.println("Pestele se joaca");
    }
}
