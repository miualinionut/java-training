package code._4_student_effort.Animal_Hierarchy;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish (String name){
        super(0);
        this.name = name;
    }

    public Fish (){
        this("");
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
        System.out.println("Pestele se joaca");
    }

    @Override
    public void eat() {
        System.out.println("Pestele mananca");
    }

    @Override
    public void walk() {
        System.out.println("Pestele nu poate sa mearga");
    }
}
