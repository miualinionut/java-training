package code._4_student_effort.challenge6;

public class Person {
    String name;
    String job;
    String university;
    String drivingLicense;
    boolean isMarried;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }

    public static class Builder{
        String name;
        String job;
        String university;
        String drivingLicense;
        boolean isMarried;

        public Builder(String name){ this.name=name;}

        public Builder job(String job){
            this.job=job;
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
