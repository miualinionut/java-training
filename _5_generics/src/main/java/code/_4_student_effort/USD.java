package code._4_student_effort;

public class USD extends Currency{

    public USD(){}
    public USD(double units){
        super(units);
    }

    public double USD_UNITS(){
        return super.getUnits();
    }

    @Override
    public String toString() {
        return USD_UNITS() + "USD";
    }
}
