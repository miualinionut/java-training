package clean.code.design_patterns.requirements;

public class CarListDisplayer {
    private CarCollection collection;
    private CarIterator iterator;

    public CarListDisplayer(CarCollection collection) {
        this.collection = collection;
        iterator = this.collection.iterator();
    }

    public void displayList() {
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
