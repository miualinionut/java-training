package code._4_student_effort.challenge_6;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicence;
    private boolean isMarried;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicence='" + drivingLicence + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }

    public Person(Builder builder){
        this.name = builder.getName();
        this.job = builder.getJob();
        this.university = builder.getUniversity();
        this.drivingLicence = builder.getDrivingLicence();
        this.isMarried = builder.isMarried();

    }
}

