package code._4_student_effort;

public class Apartment {
    String _location;
    int _monthlyRentCost;
    public Apartment(String location, int monthlyRentCost){
        _location=location;
        _monthlyRentCost=monthlyRentCost;
    }

    public String get_location() {
        return _location;
    }

    public int get_monthlyRentCost() {
        return _monthlyRentCost;
    }
}
