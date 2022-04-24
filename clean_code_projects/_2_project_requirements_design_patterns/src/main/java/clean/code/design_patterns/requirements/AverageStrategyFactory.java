package main.java.clean.code.design_patterns.requirements;

public class AverageStrategyFactory {
    // lazy singleton implementation
    private static AverageStrategyFactory instance;

    private AverageStrategyFactory() {

    }

    // singleton instance
    public static AverageStrategyFactory getInstance() {
        if (instance == null) {
            instance = new AverageStrategyFactory();
        }
        return instance;
    }

    public Average createAverageStrategy(String type) {
        Average averageStrategy = null;

        if (type.equalsIgnoreCase("mean")) {
            averageStrategy = new MeanAverage();
        } else if (type.equalsIgnoreCase("median")) {
            averageStrategy = new MedianAverage();
        } else if (type.equalsIgnoreCase("mode")) {
            averageStrategy = new ModeAverage();
        } else {
            System.out.println("Wrong type, please choose: mean, median or mode");
        }

        return averageStrategy;
    }
}
