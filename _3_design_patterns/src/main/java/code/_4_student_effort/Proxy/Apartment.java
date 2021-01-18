package code._4_student_effort.Proxy;

public class Apartment{
    private String Location;
    private int rentCost;

    public Apartment(String Location, int rentCost){
        this.Location = Location;
        this.rentCost = rentCost;
    }
    public String getLocation(){
        return Location;
    }
    public int getRentCost(){
        return rentCost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + Location + '\'' +
                ", monthlyRentCost=" + rentCost +
                '}';
    }
}
