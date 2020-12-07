package code._4_student_effort;

public class Information{
    //required parameters
    private String name;


    //optional parameters
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMarried;

    public Information(Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    public String getName(){
        return name;
    }

    public String getJob(){
        return job;
    }

    public String getUniversity(){
        return university;
    }

    public boolean getDrivingLicense(){
        return drivingLicense;
    }

    public boolean getIsMarried(){
        return isMarried;
    }


}

