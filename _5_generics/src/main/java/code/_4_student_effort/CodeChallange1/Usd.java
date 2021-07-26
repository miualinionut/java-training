package code._4_student_effort.CodeChallange1;

public class Usd extends Currency{
    public Usd(){ }

    public Usd(double value){
        super(value);
    }

    public double dollars(){
        return super.getValue();
    }

    @Override
    public String toString() {
        return dollars() + " USD";
    }
}
