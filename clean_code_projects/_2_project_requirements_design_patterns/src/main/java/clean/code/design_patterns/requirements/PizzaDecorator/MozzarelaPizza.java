package clean.code.design_patterns.requirements.PizzaDecorator;

public class MozzarelaPizza extends PizzaDecorator{
    public MozzarelaPizza(Pizza pizza) {
        super(pizza);
        addIngredient(new Ingredient("branza", 2));
        System.out.println("Adaug branza in MozzarelaPizza.");
    }

    @Override
    public int getCost(){
        System.out.println("calculez cost in Mozzarella ");
        return tempPizza.getCost();
    }
    public void showPizzaName() {
        String pizzaName = this.getClass().getSimpleName();
        System.out.println(pizzaName);
    }
}
