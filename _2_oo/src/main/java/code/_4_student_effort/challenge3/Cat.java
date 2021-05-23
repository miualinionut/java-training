package code._4_student_effort.challenge3;

public class Cat extends Animal implements Pet{
    String name;
    int legs;
    Cat(String n){
        super(4);
        name=n;
    }
    Cat(){
        this("");
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

    public void play() {
        System.out.println("play from cat");

    }

    public void eat(){
        System.out.println("Cat eat");
    }
}
