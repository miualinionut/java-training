package code._4_student_effort;

public class Person {
    String name;
    String job;
    String university;
    Boolean drivingLicense;
    Boolean isMarried;

    public Person(Builder builder){
        this.name= builder.name;
        this.job= builder.job;
        this.university= builder.university;
        this.drivingLicense= builder.drivingLicense;
        this.isMarried= builder.isMarried;

    }

    public static class Builder{
        String name;
        String job;
        String university;
        Boolean drivingLicense;
        Boolean isMarried;
        public Builder(String name){
            this.name=name;
        }
        public Builder setJob(String job){
            this.job=job;
            return this;
        }
        public Builder setUniversity(String university){
            this.university=university;
            return this;
        }
        public Builder setDrivingLicense(Boolean drivingLicense){
            this.drivingLicense=drivingLicense;
            return this;
        }
        public Builder setIsMarried(Boolean isMarried){
            this.isMarried=isMarried;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
