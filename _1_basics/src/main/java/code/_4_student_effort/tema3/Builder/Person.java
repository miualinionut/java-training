package code._4_student_effort.tema3.Builder;
import javafx.util.Builder;

public class Person {

    private String name;
    private String job;
    private String university;
    private boolean drivingLicence;
    private boolean isMarried;

    private Person(Builder builderClass) {
        this.name = builderClass.name;
        this.job = builderClass.job;
        this.university = builderClass.university;
        this.drivingLicence = builderClass.drivingLicence;
        this.isMarried = builderClass.isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicence=" + drivingLicence +
                ", isMarried=" + isMarried +
                '}';
    }

    public static class Builder {
        private String name;
        private String job;
        private String university;
        private boolean drivingLicence;
        private boolean isMarried;

        public Builder(String nume){
            this.name = nume; //parametrul pe care il vrem obligatoriu
        }

        public Builder setJob(String job){
            this.job = job;
            return this;
        }

        public Builder setUniversity(String uni){
            this.university = uni;
            return this;
        }

        public  Builder setDriving(boolean driveOrNot){
            this.drivingLicence = driveOrNot;
            return this;
        }

        public Builder setMarried(boolean marriedOrNot){
            this.isMarried = marriedOrNot;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
