package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        CarCollection carCollection = new CarCollection();
        CarFactory carFactory = new CarFactory();

        carCollection.add(carFactory.getCar("bmw"));
        carCollection.add(carFactory.getCar("toyota"));

        CarIterator iterator = carCollection.iterator();

        while(iterator.hasNext()) {
            Car car = iterator.next();

            System.out.println(car.getModel() + " " + car.getFuelType() + " " + car.getPrice() + " " + car.getRelaseYear());
        }
    }
}
