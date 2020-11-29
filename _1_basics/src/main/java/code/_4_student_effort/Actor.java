package code._4_student_effort;

public class Actor {
    public String name;
    public Integer age;
    public Premiu[] achievments;

    public Actor(String name,Integer age){
        this.name = name;
        this.age = age;
    }
    public Actor(String name,Integer age,Premiu[] achievments){
        this.name = name;
        this.age = age;
        this.achievments = achievments;
    }
}
