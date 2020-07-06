package clean.code.design_patterns.requirements._3_DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Car car1 = new LuxuryCar(new CarImplement());
        Car car2 = new BasicCar(new CarImplement());
        System.out.println(car1.create());
        System.out.println(car2.create());
    }
}
