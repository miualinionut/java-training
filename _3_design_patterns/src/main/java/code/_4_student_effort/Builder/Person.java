package code._4_student_effort.Builder;

public class Person {
    private final String name;
    private final String job;
    private final String university;
    private final String drivingLicense;
    private final boolean isMaried;

    public Person(Builder builder){
    this.name = builder.name;
    this.job = builder.job;
    this.drivingLicense = builder.DrivingLicense;
    this.university = builder.university;
    this.isMaried = builder.isMaried;

    }
    public static class Builder{
        private final String name;
        private String job;
        private String university;
        private String DrivingLicense;
        private boolean isMaried;

        public Builder(String name){
            this.name = name;
        }
        public Builder setJob(String job){
            this.job = job;
            return this;
        }
        public Builder setUniversity(String university){
            this.university = university;
            return this;
        }
        public Builder setDrivingLicense(String drivingLicense){
            this.DrivingLicense = drivingLicense;
            return this;
        }
        public Builder setIsMaried(boolean isMaried){
            this.isMaried = isMaried;
            return this;
        }
        public Person build(){return new Person(this);}
    }

}
