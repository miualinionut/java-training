package code._4_student_effort;

public abstract class Currency {
    private double units;

    public Currency() {
    }

    protected Currency(double units) {
        this.units = units;
    }


    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }
}
