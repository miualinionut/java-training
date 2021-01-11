package code._4_student_effort.exchange_desk;

import java.util.HashMap;

public class USD implements Currency{
    private double units;

    USD() {
    }

    USD(double units) {
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
        return getUnits() + " USD";
    }
}
