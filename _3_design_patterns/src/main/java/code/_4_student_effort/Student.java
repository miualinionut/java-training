package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observer{
    private String name;
    List<Teacher> teachers;

    private int money;

    public Student (String name) {
        this.name = name;
        teachers = new ArrayList<>();
    }

    public Student (String name, int money) {
        this.name = name;
        this.money = money;
    }

    public boolean nameWithoutP() {
        return (this.name.startsWith("P") || this.name.startsWith("p"));
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void listenTo(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }
}
