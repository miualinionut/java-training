package code._3_in_class;

import java.util.HashSet;

public class Set {
    Set<Student> set = new HashSet<>();
}
static class Student {
    private String nume;
    private Integer varsta;

    public Student(String nume, Integer varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}