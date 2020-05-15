package code._4_student_effort.code_challenge_1_Exchange_Desk;

public class Ron extends Currency{
    public Ron() {
    }

    public Ron(double units) {
        super(units);
    }

    public double lei() {
        return super.getUnits();
    }

    @Override
    public String toString() {
        return lei() + " RON";
    }
}
