package code._4_student_effort.challenge_6;

public class Person {
    private String name, job, university;
    private Boolean drivingLicence, isMarried;

    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.job = personBuilder.job;
        this.university = personBuilder.university;
        this.drivingLicence = personBuilder.drivingLicence;
        this.isMarried = personBuilder.isMarried;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public Boolean isDrivingLicence() {
        return drivingLicence;
    }

    public static class PersonBuilder {
        private String name, job, university;
        private Boolean drivingLicence, isMarried;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        public PersonBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public PersonBuilder setDrivingLicence(Boolean drivingLicence) {
            this.drivingLicence = drivingLicence;
            return this;
        }

        public PersonBuilder setMarried(Boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
