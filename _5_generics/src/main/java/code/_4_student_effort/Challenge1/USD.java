package code._4_student_effort.Challenge1;

public class USD extends Currency {


    public USD(float quantity) {
        super(quantity);
    }

    @Override
    public String toString() {
        return "USD{" +
                "quantity=" + quantity +
                '}';
    }
}
