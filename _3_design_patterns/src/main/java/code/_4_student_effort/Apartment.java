package code._4_student_effort;

public class Apartment {
    private final String _location;
    private final int _monthlyRentCost;
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

    @Override
    public String toString() {
        return "Apartment{" + "location='" + _location + '\'' + ", monthlyRentCost=" + _monthlyRentCost + '}';
    }
}
