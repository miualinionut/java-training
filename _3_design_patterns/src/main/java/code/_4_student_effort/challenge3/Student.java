package code._4_student_effort.challenge3;

public class Student {

    String name;
    int money;

    Student(){};
    Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
