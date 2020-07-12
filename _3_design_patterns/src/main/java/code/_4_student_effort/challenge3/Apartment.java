package code._4_student_effort.challenge3;

public class Apartment {

    String location;
    int monthlyRentCost;

    Apartment(){};
    Apartment(String location, int monthlyRentCost){
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}
