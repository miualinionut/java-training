package code._4_student_effort._3_proxy;

public class Student {
    private String name;
    private int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}
