package code._4_student_effort.Challenge_3_Proxy;

public class Apartment {
    private String location;
    private int monthlyRentCost;
    public Apartment(String location, int monthlyRentCost){
        this.location=location;
        this.monthlyRentCost=monthlyRentCost;
    }
    public String getLocation(){
        return location;
    }
    public int getMonthlyRentCost(){
        return monthlyRentCost;
    }
}
