package code._4_student_effort.challenge_3;

public class Apartment {

    private String location;
    private int monthlyRentCost;

    public Apartment(String location, int rent){
        this.location = location;
        this.monthlyRentCost = rent;
    }

    public int getMonthlyRentCost(){
        return this.monthlyRentCost;
    }

}
