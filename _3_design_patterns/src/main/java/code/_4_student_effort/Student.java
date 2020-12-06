package code._4_student_effort;

public class Student {
    private final String name;
    private final int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    public String toString(){
         return "{name='" + name + "', money=" + money +"}";
    }

}
