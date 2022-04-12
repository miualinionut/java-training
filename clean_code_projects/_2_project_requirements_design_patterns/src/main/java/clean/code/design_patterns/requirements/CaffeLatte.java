package clean.code.design_patterns.requirements;

public class CaffeLatte implements Coffee {

    @Override
    public Double getCoffeeQuantity() {
        return 250.00;
    }

    @Override
    public Double getMilkQuantity() {
        return 100.00;
    }

    @Override
    public String getToppings() {
        return null;
    }

    @Override
    public Double price() {
        return 14.00;
    }

    @Override
    public void prepareCoffe() {
        System.out.println("Caffe Latte  is being prepared");
    }
}
