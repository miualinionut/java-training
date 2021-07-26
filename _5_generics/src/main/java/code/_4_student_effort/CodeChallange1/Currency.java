package code._4_student_effort.CodeChallange1;

public abstract class Currency {
    private double value;

    public Currency(){ }

    public Currency(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
