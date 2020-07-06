package code._4_student_effort._1_exchangeDesk;

public class USD extends Currency{
    public USD(double units){
        super(units);
    }

    public double dollars(){
        return super.getUnits();
    }
}
