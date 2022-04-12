package clean.code.design_patterns.requirements;

public class CaramelMacchiato implements Coffee {


    @Override
    public Double getCoffeeQuantity() {
        return 300.00;
    }

    @Override
    public Double getMilkQuantity() {
        return 40.00;
    }

    @Override
    public String getToppings() {
        return "caramel";
    }

    @Override
    public Double price() {
        return 15.00;
    }

    @Override
    public void prepareCoffe() {
        System.out.println("Caramel Macchiato is being prepared");
    }
}
