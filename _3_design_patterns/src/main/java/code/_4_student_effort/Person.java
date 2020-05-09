package code._4_student_effort;


public class Person {
    private String name;//required parameter
    private String job; //optional parameter
    private String university;  //optional parameter
    private String drivingLicense; //optional parameter
    boolean isMarried; //optional parameter

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
        this.university = builder.university;
    }

    public static class Builder {
        private String name;
        private String job; //optional parameter
        private String university;  //optional parameter
        private String drivingLicense; //optional parameter
        boolean isMarried; //optional parameter

        public Builder(String name) {
            this.name = name;

        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder drivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }


}

