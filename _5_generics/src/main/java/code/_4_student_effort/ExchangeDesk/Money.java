package code._4_student_effort.ExchangeDesk;

public abstract class Money {
    protected double value;

    public Money(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double divideBy(double number){
        return  value/number;
    }
    public double multiplicateBy( double number){
        return value*number;
    }
}
