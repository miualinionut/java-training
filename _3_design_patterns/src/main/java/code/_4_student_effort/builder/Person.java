package code._4_student_effort.builder;

public class Person {
    private String name; // required
    private String job; // optional
    private String university; // optional
    private boolean drivingLicense; // optional
    private boolean isMarried; //optional

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    public String getName() {
        return name;
    }

    public String hasJob() {
        return job;
    }

    public String hasUniversity() {
        return university;
    }

    public boolean hasDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "{Name = " + name +
               ", Job = " + job +
               ", University = " + university +
               ", Driving License = " + drivingLicense +
               ", Married = " + isMarried + "}";
    }

    public static class Builder {
        private String name; // required
        private String job; // optional
        private String university; // optional
        private boolean drivingLicense; // optional
        private boolean isMarried; //optional

        public Builder(String name) {
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

        public Builder setDrivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder setMarried(boolean married) {
            this.isMarried = married;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
