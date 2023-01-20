package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class CarCollection {
    private List<Car> list;

    public CarCollection() {
        list = new ArrayList<>();
    }

    public  void add(Car car) {
        this.list.add(car);
    }

    public CarIterator iterator() {
        return new CarIterator(this.list);
    }
}
