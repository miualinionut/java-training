package code._4_student_effort.challenge3;

public class Student {
    String name;
    int money;
    public Student(String n,int m){
        name=n;
        money=m;
    }

    String getName(){

        return name;
    }

    int getMoney(){

        return money;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }


}
