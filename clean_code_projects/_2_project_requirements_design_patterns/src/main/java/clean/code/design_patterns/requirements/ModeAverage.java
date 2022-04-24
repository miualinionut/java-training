package main.java.clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ModeAverage implements Average{
    @Override
    public Double calculateAverage(ArrayList<Double> values) {
        // returns the most frequent value
        HashMap<Double, Integer> freq = new HashMap<>();
        for (Double value: values) {
            if (freq.containsKey(value)) {
                freq.put(value, freq.get(value) + 1);
            } else {
                freq.put(value, 1);
            }
        }

        int max_count = 0;
        Double most_freq = 0.0;
        for (Map.Entry<Double, Integer> entry: freq.entrySet()) {
            if (entry.getValue() > max_count) {
                max_count = entry.getValue();
                most_freq = entry.getKey();
            }
        }

        return most_freq;
    }
}
