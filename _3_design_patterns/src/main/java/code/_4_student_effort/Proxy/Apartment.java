package code._4_student_effort.Proxy;

public class Apartment {
    private String location;
    private int monthlyRentCost;
    public Apartment(String location, int monthlyRentCost){
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public int getMonthlyRentCost(){
        return this.monthlyRentCost;
    }
    public String getLocation(){return this.location;}

    public String toString(){
        return "Apartment{location:"+getLocation()+" ,monthlyRentCost="+getMonthlyRentCost()+"}";
    }
}
