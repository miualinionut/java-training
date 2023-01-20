package clean.code.design_patterns.requirements;

import java.util.Scanner;

public class ConsoleInputReader {
    private CarCollection collection;
    private String userInput;
    private Scanner scanner;

    public ConsoleInputReader() {
        collection = new CarCollection();
        scanner = new Scanner(System.in);
    }

    public CarCollection getCarCollection() {
        return collection;
    }

    public void readInput() {
        CarFactory factory = new CarFactory();
        userInput = scanner.next();

        while(!userInput.toLowerCase().equals("stop")) {
            collection.add(factory.getCar(userInput));
            userInput = scanner.next();
        }
    }
}
