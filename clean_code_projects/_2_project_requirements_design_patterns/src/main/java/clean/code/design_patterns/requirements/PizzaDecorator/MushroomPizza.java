package clean.code.design_patterns.requirements.PizzaDecorator;

public class MushroomPizza extends PizzaDecorator{
    public MushroomPizza(Pizza newPizza) {
        super(newPizza);
        addIngredient(new Ingredient("ciuperci", 3));
        System.out.println("Adaug ciuperci in MushroomPizza.");
    }

    @Override
    public int getCost(){
        System.out.println("calculez cost in Mushroom.");
        return tempPizza.getCost();
    }

    public void showPizzaName() {
        String pizzaName = this.getClass().getSimpleName();
        System.out.println(pizzaName);
    }
}
