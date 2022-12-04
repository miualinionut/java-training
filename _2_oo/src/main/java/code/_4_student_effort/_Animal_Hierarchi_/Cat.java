package code._4_student_effort._Animal_Hierarchi_;

public class Cat extends Animal implements Pet {
    private String name;
    public Cat(){
        this("");
    }
    public Cat(String name){
        super(4);
        this.name=name;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void play(){
        System.out.println("The cat is playing");
    }
    public void eat(){
        System.out.println("The cat is eating ");
    }
}
