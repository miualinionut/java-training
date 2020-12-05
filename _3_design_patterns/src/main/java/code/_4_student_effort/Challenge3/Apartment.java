package code._4_student_effort.Challenge3;

public class Apartment {
    String location;
    int monthlyRentCost;

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public String toString() {
        return("Apartment{location=" + location +
                ", monthlyRentCost = " + monthlyRentCost + "}");
    }
}
