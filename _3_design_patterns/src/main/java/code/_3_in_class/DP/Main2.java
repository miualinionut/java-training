package code._3_in_class.DP;

public class Main2 {

    public static void main(String[] args) {
        Student s1 = Student.of("ion");
    }
}

class Student{
    private String nume;

    private Student(String nume){
        this.nume = nume;
    }

    public static Student of(String nume){ //factory method ==> of, value of, method
        return new Student(nume);
    }
}
