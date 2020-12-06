package code._4_student_effort.challenge_3_proxy;

public class Apartament {
    String location;
    int monthlyRentCost;
    boolean isRented;

    public Apartament(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
        isRented = false;
    }

    @Override
    public String toString() {
        return "Apartament at: " + location + " for $" + monthlyRentCost;
    }
}
