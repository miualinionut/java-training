package code._4_student_effort;

public class Builder {
    //required parameters
    public String name;


    //optional parameters
    public String job;
    public String university;
    public boolean drivingLicense;
    public boolean isMarried;

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

    public Builder setDrivingLicense(boolean drivingLicense){
        this.drivingLicense = drivingLicense;
        return this;
    }

    public Builder setIsMarried(boolean isMarried){
        this.isMarried = isMarried;
        return this;
    }

    public Information build(){
        return new Information(this);
    }


}