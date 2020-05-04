package code._4_student_effort.Builder;

public class Person {
    String name;
    String job;
    String university;
    boolean drivingLicense;
    boolean isMaried;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Person(String name, String job, String university) {
        this.name = name;
        this.job = job;
        this.university = university;
    }

    public Person(String name, String job, String university, boolean drivingLicense) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
    }

    public Person(String name, String job, String university, boolean drivingLicense, boolean isMaried) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
        this.isMaried = isMaried;
    }
}
