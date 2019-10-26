package code._0_activity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Student> students = populateListOfStudents();
        getHighestScoreV1(students);
        getHighestScoreV2(students);
        getHighestScoreV3(students);
        getHighestScoreV4(students);
    }

    // Display the highest score of the students who graduated in 2011
    private static void getHighestScoreV1(List<Student> students) {
        double highestScore = 0.0;
        for (Student s : students) {
            if (s.getGradYear() == 2011) {
                if (s.getScore() > highestScore) {
                    highestScore = s.getScore();
                }
            }
        }
        System.out.println(highestScore);
    }

    // Display the highest score of the students who graduated in 2011 or their first name starts with "A"
    private static void getHighestScoreV2(List<Student> students) {
        double highestScore = 0.0;
        for (Student s : students) {
            if (s.getGradYear() == 2011 || s.firstName.startsWith("A")) {
                if (s.getScore() > highestScore) {
                    highestScore = s.getScore();
                }
            }
        }
        System.out.println(highestScore);
    }

    private static void getHighestScoreV3(List<Student> students) {
        double highestScore = students.stream()
                .filter(new Predicate<Student>() {
                    public boolean test(Student s) {
                        return s.getGradYear() == 2011;
                    }
                })
                .map(new Function<Student, Double>() {
                    @Override
                    public Double apply(Student student) {
                        return student.getScore();
                    }
                })
                .max(Student.byScore).get();
        System.out.println(highestScore);

    }

    private static void getHighestScoreV4(List<Student> students) {
        double highestScore = students.stream()
                .filter((Student s) -> s.getGradYear() == 2011)
                .map((Student s) -> s.getScore())
                .max(Student.byScore).get();
        System.out.println(highestScore);
    }

    private static List<Student> populateListOfStudents() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(2011, 9.8);
        Student student2 = new Student(2018, 8.6);
        Student student3 = new Student(2009, 9.5);
        Student student4 = new Student(2011, 9.3);
        Student student5 = new Student(2012, 10.0);
        Student student6 = new Student(2013, 7.0);
        Student student7 = new Student(2015, 5.0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        return students;
    }
}
