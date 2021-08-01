package code._4_student_effort.challenge_3;

public class Student {
    private String name;
    private int money;

    public Student(String name, int cash){
        this.name = name;
        this.money = cash;
    }

    public String getName(){
        return this.name;
    }

    public int getMoney(){
        return this.money;
    }

}
