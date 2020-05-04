package code._4_student_effort.challenge3;

public class Apartment {
    String location;
    int monthlyRentCost;

    public Apartment(String location, int monthlyrentcost) {
        this.location = location;
        this.monthlyRentCost = monthlyrentcost;
    }

    public String getLocation() {
        return location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}
