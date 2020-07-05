package code._4_student_effort;

public class Currency {
    public double units;

    public Currency(double units) {
        this.units = units;
    }

    public Currency() {
    }

    @Override
    public String toString() {
        return "units=" + units;
    }
}
