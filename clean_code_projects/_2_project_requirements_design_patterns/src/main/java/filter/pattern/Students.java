package filter.pattern;

public class Students {
    private String name;
    private String profile;
    private int year;
    private String scholarship;

    public Students(String name,String profile,int year, String scholarship){
        this.name=name;
        this.profile=profile;
        this.year=year;
        this.scholarship=scholarship;
    }

    public String getName() {
        return name;
    }
    public String getProfile(){
        return profile;
    }
    public int getYear(){
        return year;
    }
    public String getScholarship(){
        return scholarship;
    }
}
