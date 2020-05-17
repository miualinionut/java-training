package code._4_student_effort.code_challenge_4_Generic_Iterator;

public class Bike {
    private String brand;
    private double topTube;

    public Bike(String brand, double topTube) {
        this.brand = brand;
        this.topTube = topTube;
    }

    public String getBrand() {
        return brand;
    }

    public double getTopTube() {
        return topTube;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", topTube=" + topTube +
                '}';
    }
}
