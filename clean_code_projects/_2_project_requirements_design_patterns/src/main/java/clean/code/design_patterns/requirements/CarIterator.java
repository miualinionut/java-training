package clean.code.design_patterns.requirements;

import java.util.List;

public class CarIterator {
    private List<Car> list;
    private int position;

    public CarIterator(List<Car> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return (position < list.size());
    }

    public Car next() {
        return list.get(position++);
    }
}
