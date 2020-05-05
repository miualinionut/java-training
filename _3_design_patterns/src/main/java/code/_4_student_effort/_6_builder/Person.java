package code._4_student_effort._6_builder;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;

    public Person(Builder build) {
        this.name = build.name;
        this.job = build.job;
        this.university = build.university;
        this.drivingLicense = build.drivingLicense;
        this.isMarried = build.isMarried;
    }

    static class Builder{
        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public Builder(String name){
            this.name = name;
        }

        public Builder job(String job){
            this.job = job;
            return this;
        }

        public Builder university(String university){
            this.university = university;
            return this;
        }

        public Builder drivingLicense(String drivingLicense){
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(boolean isMarried){
            this.isMarried = isMarried;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
