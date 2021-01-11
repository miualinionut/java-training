package code._4_student_effort.exchange_desk;

import java.util.HashMap;

public class RON implements Currency{
    private double units;

    RON() {
    }

    public RON(double units) {
        this.units = units;
    }

    @Override
    public double getUnits() {
        return this.units;
    }

    @Override
    public void setUnits(double units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return getUnits() + " RON";
    }
}
