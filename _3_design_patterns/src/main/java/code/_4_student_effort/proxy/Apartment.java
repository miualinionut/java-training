package code._4_student_effort.proxy;

public class Apartment {
    private String location;
    private int monthlyRentCost;
    private boolean isRent;

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
        this.isRent = false;
    }

    public String getLocation() {
        return location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }

    @Override
    public String toString() {
        return "Apartment" +
                "{location = '" + location + "', " +
                "monthlyRentCost = " + monthlyRentCost + "}";
    }
}
