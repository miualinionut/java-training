package code._4_student_effort.challenge_3_;

public class Apartment {
    private String location;
    private int monthlyRentCost;

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public String getLocation() {
        return location;
    }

    public int getRent() {
        return monthlyRentCost;
    }

    public void display() {
        System.out.print("Apartment = {location = " + location + ", monthlyRentcost = " + monthlyRentCost + "}");
    }
}
