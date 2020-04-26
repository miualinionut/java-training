package code._4_student_effort.tema2.Challenge3;

public class Cat extends Animal implements Pet {

    protected String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this(" ");
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
        System.out.println("I play meow meow!");
    }

    public void eat(){
        System.out.println("I eat mice and milk");
    }
}
