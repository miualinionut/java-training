package code._4_student_effort.challenge6;

import java.nio.file.attribute.AclEntry;

public class Person {

    private String name;
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMarried;

    public String getName(){
        return name;
    }
    public String getJob(){
        return job;
    }

    public String getUniversity(){
        return university;
    }

    public boolean hasDrivingLicense(){
        return drivingLicense;
    }

    public boolean hasIsMarried(){
        return isMarried;
    }

    private Person(PersonBuilder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    public static class PersonBuilder{
        private String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMarried;

        public PersonBuilder(String name){
            this.name = name;
        }

        public PersonBuilder setJob(String job){
            this.job = job;
            return this;
        }

        public PersonBuilder setUniversity(String university){
            this.university = university;
            return this;
        }

        public PersonBuilder setDrivingLicense(boolean drivingLicense){
            this.drivingLicense = drivingLicense;
            return this;
        }

        public PersonBuilder setIsMarried(boolean isMarried){
            this.isMarried = isMarried;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", isMarried=" + isMarried +
                '}';
    }
}
