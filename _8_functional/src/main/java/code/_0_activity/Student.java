package code._0_activity;

import java.util.Comparator;

public class Student {
    public static Comparator<Student> byName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };

    public static Comparator<Double> byScore = new Comparator<Double>() {
        @Override
        public int compare(Double o1, Double o2) {
            return o1.compareTo(o2);
        }
    };

    int gradYear;
    double score;
    String firstName;

    public Student(int gradYear, double score) {
        this.gradYear = gradYear;
        this.score = score;
    }

    public Student(int gradYear, double score, String firstName) {
        this.gradYear = gradYear;
        this.score = score;
        this.firstName = firstName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
