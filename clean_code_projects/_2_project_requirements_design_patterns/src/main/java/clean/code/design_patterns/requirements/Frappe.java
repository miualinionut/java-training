package clean.code.design_patterns.requirements;

public class Frappe implements Coffee {

    @Override
    public Double getCoffeeQuantity() {

        return 200.00;
    }

    @Override
    public Double getMilkQuantity() {

        return 50.00;
    }

    @Override
    public String getToppings() {
        return "whipped cream";
    }

    @Override
    public Double price() {

        return 20.00;
    }

    @Override
    public void prepareCoffe() {
        System.out.println("Frappe is being prepared");
    }
}
