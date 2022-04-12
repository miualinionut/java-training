package clean.code.design_patterns.requirements;

public class Cappuccino implements Coffee {

    @Override
    public Double getCoffeeQuantity() {
        return 250.00;
    }

    @Override
    public Double getMilkQuantity() {
        return 50.00;
    }

    @Override
    public String getToppings() {
        return null;
    }

    @Override
    public Double price() {
        return 12.00;
    }

    @Override
    public void prepareCoffe() {
        System.out.println("Cappuccino is being prepared");
    }
}
