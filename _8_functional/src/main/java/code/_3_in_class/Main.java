package code._3_in_class;

import javafx.fxml.Initializable;
import org.w3c.dom.ls.LSOutput;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Student> students = getStudents();
/*
        over8_iterative_with_for(students);
      System.out.println("=======================================");
        over8_iterative_with_iterator(students);
      System.out.println("=======================================");
      */
        over8_iterative_with_stream(students);
      System.out.println("=======================================");
      over8_iterative_with_threads(students);

      toti_studentii_au_nota_10(students);

      exista_cel_putin_un_student_cu_nota4(students);

    }

    private static void exista_cel_putin_un_student_cu_nota4(List<Student> students) {

        boolean ok = students.parallelStream().anyMatch(student -> student.getNota().equals(4));
//cand gaseste, primu procesor care-l gaseste, ii opreste pe ceilalt. "BA GATA L-AM GASIT"
        if(ok){
            System.out.println("s-o gasit unu cu nota 4");
        }

    }

    private static void toti_studentii_au_nota_10(List<Student> students) {

        long studentiDeNota_10 = students.stream().
        filter(student -> student.getNota() == 10).count();

        boolean totiAuNota10 = students.stream()
        .allMatch(student -> student.getNota().equals(10));

        System.out.println("toti au 10: " + (studentiDeNota_10 == students.size()));

        System.out.println("toti au 10: " + (totiAuNota10));
    }

    private static void over8_iterative_with_threads(List<Student> students) throws InterruptedException {

      List<Student> s1 = students.subList(0, 3);
      List<Student> s2 = students.subList(3,6);

//      Spliterator<Student> spliterator = students.spliterator();
//      Spliterator<Student> sp1 = spliterator.trySplit();
//      Spliterator<Student> sp2 = spliterator.trySplit();
//      Spliterator<Student> sp3 = spliterator.trySplit();

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

        //stream e un iterator intern
      // e o metoda care apeleaza in interior ce faceam noi la iterator
      // avem doua clase anonim predicate,consumer
      //dar putem sa inlocuim una cu o metoda anonima folosind lamba
      // student parametru de intrare
      // - > cod metoda ( ce face metoda )
      // parametru -> cod
//        students.stream()
//                .filter(student -> student.getNota() > 8) // predicat pt ca intoarce boolean
//                .forEach(x -> System.out.println(x)); // ii dau ceva si nu intoarce nimic e consumer
      // nu ii dau ceva dar imi intorace ceva se num suplierer

students.parallelStream().filter(student -> student.getNota() > 8 ).forEach( x -> System.out.println(x));
// codul asta merge multi-core
      // foloseste splitarotor intern
  }

  private static void over8_iterative_with_iterator(List<Student> students) {

        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {

            Student student = it.next();
            if (student.getNota() > 8) {
                System.out.println(student);
            }

        }

    }

    private static void over8_iterative_with_for(List<Student> students) {

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getNota() > 8) {
                System.out.println(student);
            }
        }
    }

    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Popescu", 10));
        students.add(new Student("Ionescu", 9));
        students.add(new Student("Georgescu", 8));
        students.add(new Student("Petrescu", 4));
        students.add(new Student("Albulescu", 6));
        students.add(new Student("Dragomirescu", 10));
        return students;
    }

    public static class Student {
        private String nume;
        private Integer nota;


        @Override
        public String toString() {
            return "Student{" +
                    "nume='" + nume + '\'' +
                    ", nota=" + nota +
                    '}';
        }

        public Student(String nume, Integer nota) {
            this.nume = nume;
            this.nota = nota;
        }

        public String getNume() {
            return nume;
        }

        public void setNume(String nume) {
            if (nume == null) {
                throw new IllegalArgumentException("nu poate fi null numele");
            }
            this.nume = nume;
        }

        public Integer getNota() {
            return nota;
        }

        public void setNota(Integer nota) {
            if (nota < 1) {
                throw new IllegalArgumentException("nu poate fi null nota");
            }
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