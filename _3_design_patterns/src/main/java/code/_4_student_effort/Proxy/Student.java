package code._4_student_effort.Proxy;

public class Student {
    private final String name;
    private final int money;

    public Student(String name,int money){
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Student{name=' " + name + '\'' + ", money= " + money + '}';
    }
}
