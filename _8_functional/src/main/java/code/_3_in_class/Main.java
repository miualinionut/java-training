package code._3_in_class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //TODO put your code changes in here
        List<Student> students = getStudents();
        over8_iterative_with_for(students);
        System.out.println("--------------------------");
        over8_iterative_with_iterator(students);
      System.out.println("--------------------------");
      over8_iterative_with_threads(students);
      System.out.println("--------------------------");
      over8_iterative_with_stream(students);
      System.out.println("--------------------------");
      toti_studentii_au_nota_10(students);
      System.out.println("---------------------------");
      exista_cel_putin_us_student_cu_nota4(students);
    }

  private static void exista_cel_putin_us_student_cu_nota4(List<Student> students) {
      boolean are4 = students.parallelStream()
              .anyMatch(s -> s.getNota().equals(4));
    System.out.println("E vreun prost pe aici? : " + are4);
    }

  private static void toti_studentii_au_nota_10(List<Student> students) {
      long studentiDeNota10 = students.stream()
              .filter(s -> s.getNota().equals(10))
              .count();
    System.out.println("toti au 10: " + (studentiDeNota10 == students.size()));

    boolean totiAu10 = students.stream()
            .allMatch(s -> s.getNota().equals(10));
    System.out.println("Toti au 10: " + totiAu10);
    }

  private static void over8_iterative_with_threads(List<Student> students) throws InterruptedException {
        List<Student> s1 = students.subList(0, 3);
        List<Student> s2 = students.subList(3, 6);

        Spliterator<Student> spliterator = students.spliterator();
        Spliterator<Student> sp1 = spliterator.trySplit();
        Spliterator<Student> sp2 = spliterator.trySplit();
        Spliterator<Student> sp3 = spliterator.trySplit();

        Runnable r1 = new MyThread(s1);
        Runnable r2 = new MyThread(s2);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    private static void over8_iterative_with_stream(List<Student> students) {
        students.parallelStream()
                .filter(student -> student.getNota() > 8)
                .forEach(x -> System.out.println(x));
    }

    private static void over8_iterative_with_iterator(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getNota() > 8)
                System.out.println(student);
        }
    }

    private static void over8_iterative_with_for(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNota() > 8)
                System.out.println(students.get(i));
        }
    }

    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Popescu", 10));
        students.add(new Student("Ionescu", 9));
        students.add(new Student("Georgescu", 8));
        students.add(new Student("Petrescu", 7));
        students.add(new Student("Albulescu", 4));
        students.add(new Student("Dragomirescu", 10));
        return students;
    }

    public static class Student {
        private String nume;
        private Integer nota;

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

        @Override
        public String toString() {
            return "Student{" +
                    "nume='" + nume + '\'' +
                    ", nota=" + nota +
                    '}';
        }

        public void setNume(String nume) {
            if (nume == null) throw new IllegalArgumentException("numele nu poate fi null");
            this.nume = nume;
        }

        public void setNota(Integer nota) {
            if (nota < 1) throw new IllegalArgumentException("nota invalida");
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
}