package code._4_student_effort.ExchangeDesk;

public class USD extends Money{

    public USD(double val){
       super(val);
    }

    @Override
    public String toString() {
        return super.getValue()+ " USD";
    }
}
