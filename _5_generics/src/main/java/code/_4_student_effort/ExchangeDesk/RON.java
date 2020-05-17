package code._4_student_effort.ExchangeDesk;

public class RON  extends Money{

    public RON(double val){
        super(val);
    }

    @Override
    public String toString() {
        return super.getValue()+ " lei";
    }
}
