package code._4_student_effort;

public class RON extends Currency {

    public RON(){};
    public RON(double units){
        super(units);
    }

    public double RON_UNITS(){
        return super.getUnits();
    }

    @Override
    public String toString() {
        return RON_UNITS() + "RON";
    }
}
