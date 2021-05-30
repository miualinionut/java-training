package code._4_student_effort.Builder;

public class Builder {
    protected final String name;
    protected String job;
    protected String university;
    protected String drivingLicense;
    protected boolean isMarried;

    public Builder(String name){
        this.name = name;
    }

    public Builder job(String job){
        this.job = job;
        return this;
    }

    public Builder university(String university) {
        this.university = university;
        return this;
    }

    public Builder drivingLicense (String drivingLicense) {
        this.drivingLicense = drivingLicense;
        return this;
    }

    public Builder isMarried(boolean isMarried) {
        this.isMarried = isMarried;
        return this;
    }

    public Person build(){
        return new Person(this);
    }
}
