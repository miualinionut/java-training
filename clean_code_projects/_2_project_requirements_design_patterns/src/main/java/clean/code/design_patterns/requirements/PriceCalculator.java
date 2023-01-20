package clean.code.design_patterns.requirements;

public class PriceCalculator {
    int totalPrice;
    public void calculatePrice(CarIterator iterator) {
        totalPrice = 0;

        while(iterator.hasNext()) {
            totalPrice += iterator.next().getPrice();
        }
    }

    public void displayPrice() {
        System.out.println();
        System.out.println("The total cost is: " + totalPrice + " euros");
    }
}
