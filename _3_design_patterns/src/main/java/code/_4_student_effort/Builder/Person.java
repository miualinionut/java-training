package code._4_student_effort.Builder;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    boolean isMarried;

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    public Person(String name) {
        this.name = name;
    }
}
