package code._4_student_effort.code_challenge_4_Generic_Iterator;

public class Car {
    private String carBrand;
    private long price;

    public Car(String carBrand, long price) {
        this.carBrand = carBrand;
        this.price = price;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", price=" + price +
                '}';
    }
}
