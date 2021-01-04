package dataprocessing;

import storage.SensorData;

import java.util.ArrayList;

public class BasicStepCountStrategy implements StepCountStrategy {
    private static int totalSteps = 0;

    public BasicStepCountStrategy() { }

    public void increment(ArrayList<SensorData> records) {
        totalSteps += records.get(records.size() - 1).getStepsCount();
    }

    @Override
    public int getTotalSteps() {
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "BasicStepCountStrategy returns the total step number:";
    }
}
