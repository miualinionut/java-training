package code._4_student_effort.CodeChallange1;

public class Ron extends Currency{
    public Ron(){ }

    public Ron(double value){
        super(value);
    }

    public double lei(){
        return super.getValue();
    }

    @Override
    public String toString() {
        return lei() + " RON";
    }
}
