package dataprocessing;

import storage.SensorData;

import java.util.ArrayList;

public class FilteredStepCountStrategy implements StepCountStrategy {
    private static int totalSteps = 0;

    public FilteredStepCountStrategy() { }

    public void increment(ArrayList<SensorData> records) {
        int steps1 = records.get(records.size() - 1).getStepsCount();
        long time1 = records.get(records.size() - 1).getTimestamp();

        if (records.size() > 1) {
            int steps2 = records.get(records.size() - 2).getStepsCount();
            long time2 = records.get(records.size() - 2).getTimestamp();

            if (Math.abs(steps1 - steps2) > 1000 && Math.abs(time1 - time2) < 1000) {
                totalSteps += 0;
            } else {
                totalSteps += steps1;
            }
        }
    }

    @Override
    public int getTotalSteps() {
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "The FilteredStepCountStrategy returns the total number of steps after checking the" +
                " requirements";
    }
}
