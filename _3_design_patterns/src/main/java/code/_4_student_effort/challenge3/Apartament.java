package code._4_student_effort.challenge3;

public class Apartament
{
    String location;
    int monthlyRentCost;

    public Apartament(String l,int m){
        location=l;
        monthlyRentCost=m;
    }
    public String getLocation(){
        return location;
    }

    public int getMonthlyRentCost(){
        return monthlyRentCost;
    }

    public String toString() {
        return "Apartament{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}
