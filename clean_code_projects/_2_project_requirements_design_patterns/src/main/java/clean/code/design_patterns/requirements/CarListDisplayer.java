package clean.code.design_patterns.requirements;

public class CarListDisplayer {

    public void displayList(CarIterator iterator) {
        while(iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getBrandName() + " "
                                + car.getModel() + " "
                                + car.getFuelType() + " "
                                + car.getPrice() + " "
                                + car.getRelaseYear());
        }
    }
}
