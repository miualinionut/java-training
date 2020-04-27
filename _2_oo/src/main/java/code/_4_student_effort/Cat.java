package code._4_student_effort;

public class Cat extends Animal implements Pet {
    private String name;
    public Cat(String n){
        super(4);
        name=n;
    }
    public Cat(){
        super(4);
        new Cat("");
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
        System.out.println("The kitten seems happy");
    }

    @Override
    public void eat() {
        System.out.println("The kitten eats their food");
    }

}
