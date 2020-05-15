package code._4_student_effort.code_challenge_1_Exchange_Desk;

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
