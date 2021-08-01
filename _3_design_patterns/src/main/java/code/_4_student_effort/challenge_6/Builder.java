package code._4_student_effort.challenge_6;


public  class Builder {
    private final String name;
    private String job;
    private String university;
    private String drivingLicence;
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
    public Builder drivingLicence(String drivingLicence){
        this.drivingLicence = drivingLicence;
        return this;
    }
    public Builder isMarried(boolean isMarried){
        this.isMarried = isMarried;
        return this;
    }

    public Person create(){
        return new Person(this);
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

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public boolean isMarried() {
        return isMarried;
    }
}