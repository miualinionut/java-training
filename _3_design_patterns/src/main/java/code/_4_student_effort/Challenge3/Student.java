package code._4_student_effort.Challenge3;

public class Student {
    int money;
    String name;
    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String toString() {
        return("Student{name=" + name +
                ", money = " + money + "}");
    }
}
