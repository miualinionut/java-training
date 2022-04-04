package code._4_student_effort;

public class Fish extends Animal implements Pet {
    private String name;
    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish is dying on land, it's a disease");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        return this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Splash");
    }

    @Override
    public void eat() {
        System.out.println("Gulp gulp gulp");
    }
}
