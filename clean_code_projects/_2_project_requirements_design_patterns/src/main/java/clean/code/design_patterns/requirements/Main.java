package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        String test = "Bmw";
        CarFactory carfactory = new CarFactory();
        Car car = carfactory.getCar(test);

        System.out.println(car.getModel());
    }
}
