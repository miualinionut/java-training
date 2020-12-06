package code._4_student_effort.challenge_6_builder;

public class Person {
    String name;
    String job;
    String university;
    boolean drivingLicence;
    boolean isMarried;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicence=" + drivingLicence +
                ", isMarried=" + isMarried +
                '}';
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicence = builder.drivingLicence;
        this.isMarried = builder.isMarried;
    }

    public static class Builder {
        String name;
        String job;
        String university;
        boolean drivingLicence;
        boolean isMarried;

        public Builder (String name){
            this.name = name;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDrivingLicence(boolean drivingLicence) {
            this.drivingLicence = drivingLicence;
            return this;
        }

        public Builder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
