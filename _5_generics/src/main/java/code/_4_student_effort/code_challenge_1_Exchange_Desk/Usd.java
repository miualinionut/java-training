package code._4_student_effort.code_challenge_1_Exchange_Desk;

public class Usd extends Currency {
    public Usd() {
    }

    public Usd(double units) {
        super(units);
    }

    public double usd() {
        return super.getUnits();
    }

    @Override
    public String toString() {
        return "$" + usd();
    }
}
