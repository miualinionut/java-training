package code._4_student_effort;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        //Code Challenge 1 - Leaders

        /*nu stiu de ce nu imi printeaza nimic. Nu imi populeaza lista cu leaders*/

        //Code Challenge 2

        /*rezolvat*/

        //Code Challenge 3

        /*incomplet*/

        //Code Challenge 4

        /*incomplet*/

        //Code Challenge 5

        Set<Student> students = new HashSet<Student>();
        students.add(new Student(1));
        students.add(new Student(3));
        students.add(new Student(4));
        students.add(new Student(1));
        students.add(new Student(3));
        System.out.println(students.size());

    }
}

class Student{
    int number;
    Student(int n){
        number = n;
    }
}