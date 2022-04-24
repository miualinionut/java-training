package main.java.clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.Comparator;

public class MedianAverage implements Average{
    @Override
    public Double calculateAverage(ArrayList<Double> values) {
        // sort the values in ascending order and return the exact middle
        values.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o1, o2);
            }
        });
        return values.get(values.size() / 2);
    }
}
