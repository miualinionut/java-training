package code._4_student_effort;

public class Apartament {
    String location;
    int monthlyRentCost;
    Apartament(String s,int m){
        location=s;
        monthlyRentCost=m;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }
}
