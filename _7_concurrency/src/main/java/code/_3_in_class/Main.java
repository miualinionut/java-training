package code._3_in_class;

import code._1_study._1_contention.MyThread;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
/*
    public static void main(String[] args) throws InterruptedException {

        List<Student> students = getStudents();
        over8_iterative_with_for(students);
        System.out.println("----FOR------");
        over8_iterative_with_itertor(students);
        System.out.println("-----ITERATOR-----");
        over8_iterative_with_stream(students);
        over8_iterative_with_thereads(students);
        toti_studenti_au_nota_10(students);
        exista_cel_putin_un_student_cu_nota4(students);
    }

    private static void exista_cel_putin_un_student_cu_nota4(List students) {

        boolean existaStudentCuNota4 = students.stream();
            .anyMatch(s -> s.getNota().equals(4));
            System.out.println("exista student cu nota 4: " + existaStudentCuNota4);

    }

    private static void toti_studenti_au_nota_10(List students) {
        long studentiDeNota10 = students.stream();
        .filter(s -> s.getNota().equals(10))
                .count();
        System.out.println("toti au 10" + (studentiDeNota10 == students.size()));

        boolean totiAuNota10 = students.stream()
                .allMatch(s -> s.getNota().equals(10));
        System.out.println("toti au 10: " + totiAuNota10);
    }

    private static void over8_iterative_with_thereads(List students) throws InterruptedException {
        List<Student> s1 = students.subList(0, 3);
        List<Student> s2 = students.subList(3, 6);

        Spliterator<Student> spliterator = students.spliterator();

        Runnable r1 = new MyThread(s1);
        Runnable r2 = new MyThread(s2);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }

    private static void over8_iterative_with_stream(List students) {
        students.stream()

                .filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student student) {
                        boolean student.getNota() > 8;
                    }
                })
                .forEach(new Consumer<Student>() {
                    @Override
                    public void accept(Student student) {
                        System.out.println(student);
                    }
                })

    }


    private static void over8_iterative_with_itertor(List students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getNota() > 8) {
                System.out.println(student);
            }
        }

    }

    private static void over8_iterative_with_for(List students) {

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getNota() > 8) {
                System.out.println(student);
            }
        }
    }


    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("popescu", 10));
        students.add(new Student("ionescu", 10));
        students.add(new Student("georgescu", 10));
        students.add(new Student("petrescu", 10));
        students.add(new Student("albulescu", 10));
        students.add(new Student("dragomirescu", 10));
        return students;
    }


    public static class Student {

        private String nume;
        private Integer nota;

        @Override
        public String toString() {
            return "String{" + "nume =" + nume + '\'' + ", nota" + nota + "}";

        }

        public Student(String nume, Integer nota) {
            this.nume = nume;
            this.nota = nota;
        }

        public String getNume() {
            return nume;
        }

        public Integer getNota() {
            return nota;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public void setNota(Integer nota) {
            this.nota = nota;
        }


    }

    public static class MyThread implements Runnable {
        private List<Student> students;

        public MyThread(List<Student> students) {
            this.students = students;

        }

        @Override
        public void run() {
            over8_iterative_with_for(students);
        }


    }
*/
}