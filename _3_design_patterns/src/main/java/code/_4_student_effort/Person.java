package code._4_student_effort;

public class Person {

    private final String name;
    private final String job;
    private final String university;
    private final boolean drivingLicense;
    private final boolean isMarried;

    public String getName(){
        return name;
    }

    public String getUniversity(){
        return university;
    }

    public boolean getDrivingLicense(){
        return drivingLicense;
    }

    public boolean getisMarried(){
        return isMarried;
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.isMarried = builder.isMarried;
        this.drivingLicense = builder.drivingLicense;
        this.university = builder.university;
    }

    public String toString(){
        return "Nume: " + name + " Job: " + job + " Universitate: " + university + " CarnetdeSoferi: " + drivingLicense + " Casatorit: " + isMarried;
    }
    public static class Builder {
        private final String name; //required
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMarried;

        public Builder (String name){
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

        public Builder setDrivingLicense(boolean drivingLicense){
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder setisMarried(boolean isMarried){
            this.isMarried = isMarried;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person.Builder("Popescu").setJob("contabil").setUniversity("ASE").setDrivingLicense(true).setisMarried(false).build();
        Person person2 = new Person.Builder("Georgescu").setJob("doctor").setUniversity("UMF").setDrivingLicense(false).setisMarried(false).build();
        Person person3 = new Person.Builder("Ionescu").setJob("programator").setUniversity("Politehnica").setDrivingLicense(true).setisMarried(true).build();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
