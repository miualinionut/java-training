package main.java.clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total number of values:");
        int size = input.nextInt();

        System.out.println("Enter values:");
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            values.add(input.nextDouble());
        }

        System.out.println("Enter the type of average you want to calculate: mean, median or mode");
        String type = input.next();
        while (!type.equalsIgnoreCase("stop")) {
            AverageStrategyFactory averageFactory = AverageStrategyFactory.getInstance();
            Average average = averageFactory.createAverageStrategy(type);

            if (average != null) {
                System.out.println("Your " + type + " average: " + average.calculateAverage(values));
            }

            System.out.println("Press stop or enter another average type: mean, media or mode");
            type = input.next();
        }

        System.out.println("--- The End ---");
    }
}
