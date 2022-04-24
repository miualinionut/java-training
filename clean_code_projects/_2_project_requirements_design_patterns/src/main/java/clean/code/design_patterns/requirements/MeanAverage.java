package main.java.clean.code.design_patterns.requirements;

import java.util.ArrayList;

public class MeanAverage implements Average{

    @Override
    public Double calculateAverage(ArrayList<Double> values) {
        // basic average
        Double sum = 0.0;
        for (Double value: values) {
            sum += value;
        }
        return sum / values.size();
    }
}
