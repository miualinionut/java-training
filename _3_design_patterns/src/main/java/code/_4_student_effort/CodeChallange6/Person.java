package code._4_student_effort.CodeChallange6;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;

    public Person(Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;

        System.out.println("Name: " + this.name);
        System.out.println("Job: " + this.job);
        System.out.println("University: " + this.university);
        System.out.println("Driving License: " + this.drivingLicense);
        System.out.println("Married: " + this.isMarried);
        System.out.println();
    }

    public static class Builder{
        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder drivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }


}
