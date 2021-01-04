package storage;

import dataprocessing.StepCountStrategy;

public class DataAgregator extends Observer {
    private StepCountStrategy strategy;
    public DataAgregator(StepCountStrategy strategy, DataRepository observable) {
        this.strategy = strategy;
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        strategy.increment(observable.getData());
        System.out.println("Description: " + strategy.getStrategyDescription() + " "
                + "steps: " + strategy.getTotalSteps());
    }
}
