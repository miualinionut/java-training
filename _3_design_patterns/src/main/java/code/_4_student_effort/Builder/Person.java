package code._4_student_effort.Builder;

public class Person {
    String name;
    String job;
    String university;
    String drivingLicence;
    Boolean isMarried;

    public Person(Builder builder){
        this.name=builder.name;
        this.job=builder.job;
        this.university=builder.university;
        this.drivingLicence=builder.drivingLicence;
        this.isMarried=builder.isMarried;
    }

    public static class Builder {
        private String name;
        private String job;
        private String university;
        private String drivingLicence;
        private Boolean isMarried;

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
        public Builder setDrivingLicence (String drivingLicence){
            this.drivingLicence = drivingLicence;
            return this;
        }

        public Builder setMarried(Boolean isMarried){
            this.isMarried = isMarried;
            return this;
        }

        public Person build(){
            return new Person( this );
        }
    }
}
