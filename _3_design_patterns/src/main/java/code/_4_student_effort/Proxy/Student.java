package code._4_student_effort.Proxy;

public class Student {
    private String Name;
    private int money;

    public Student(String Name, int money){
        this.Name = Name;
        this.money = money;
    }
    public String getName(){
        return Name;
    }
    public int getMoney(){
        return money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + Name + '\'' +
                ", money=" + money +
                '}';
    }
}
