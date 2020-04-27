package code._4_student_effort._3_Challenge;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish(){
        super(0);
    }

    @Override
    void walk() {
        System.out.println("Pestele nu merge");
    }

    @Override
    void eat() {
        System.out.println("Pestele mananca chestii");
    }

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
        System.out.println("pestii nu se joaca");
    }
}
