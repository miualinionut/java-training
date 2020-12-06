package code._4_student_effort;

public class Apartment{
    private final String location;
    private final int monthlyRentCost;

    public Apartment(String location, int monthlyRentCost){
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public String getLocation(){
        return location;
    }

    public int getMonthlyRentCost(){
        return monthlyRentCost;
    }

    public String toString(){
        return "{location='" + location + "', monthlyRentCost=" + monthlyRentCost +"}";
    }

}
