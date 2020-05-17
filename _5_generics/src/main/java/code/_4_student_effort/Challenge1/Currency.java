package code._4_student_effort.Challenge1;

public abstract class Currency {

    float quantity;

    public Currency(float quantity) {
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
