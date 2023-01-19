package clean.code.design_patterns.requirements.PizzaDecorator;

public abstract class PizzaDecorator implements Pizza {

    //PizzaDecorator wrapper/decorator peste un ob de baza Pizza
    protected Pizza tempPizza;

    public PizzaDecorator(Pizza newPizza) {

        tempPizza = newPizza;
        System.out.println("Creez newPizza in PizzaDecorator " + tempPizza);
    }

    @Override
    public void addIngredient(Ingredient ingredient) {

        tempPizza.addIngredient(ingredient);
        System.out.println("Adaug ingredient in PizzaDecorator " + ingredient + " " + tempPizza);
    }

    @Override
    public int getCost() {
        System.out.println("calculez cost in PizzaDecorator");
        return 0;
    }

    @Override
    public void showIngredients() {
        System.out.println("ShowIngredients in PizzaDecorator");
        tempPizza.showIngredients();
    }

    @Override
    public void showPizzaName() {
        String pizzaName = this.getClass().getSimpleName();
        System.out.println(pizzaName);
    }

    @Override
    public String toString() {
        return "PizzaDecorator{" +
                "tempPizza=" + tempPizza +
                '}';
    }
}
