package code._4_student_effort;
public class Ron extends Currency {
    public Ron() {

    }

    public Ron(double units) {
        super(units);
    }

    public double lei() {
        return super.getUnits();
    }

    public String toString() {
        return lei() + "RON";
    }
}
