package clean.code.design_patterns.requirements.CombinedDesignPatterns;


import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        orderBuilder builder=new orderBuilder();
        itemOrders orderedItems=builder.PizzaAndDrink();
        orderedItems.showItems();
        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());

    }
}
