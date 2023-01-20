package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        inputReader.readInput();

        CarListDisplayer displayer = new CarListDisplayer();
        PriceCalculator calculator = new PriceCalculator();

        displayer.displayList(inputReader.getCarCollection().iterator());

        calculator.calculatePrice(inputReader.getCarCollection().iterator());
        calculator.displayPrice();
    }
}
