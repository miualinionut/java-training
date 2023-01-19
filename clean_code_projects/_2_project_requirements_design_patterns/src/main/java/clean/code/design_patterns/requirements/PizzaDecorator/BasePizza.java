package clean.code.design_patterns.requirements.PizzaDecorator;
import java.util.ArrayList;
import java.util.List;

public class BasePizza implements Pizza {

    String pizzaCustomName;
    private List<Ingredient> ingredients;

    public BasePizza() {
        this.ingredients = new ArrayList<>();
        System.out.println("Adaug aluat in BasePizza.");
        ingredients.add(new Ingredient("aluat", 9));
        System.out.println("Adaug sos de rosii in BasePizza");
        ingredients.add(new Ingredient("sos de rosii", 1));

    }

    public BasePizza(String pizzaCustomName) {
        this.pizzaCustomName = pizzaCustomName;
        this.ingredients = new ArrayList<>();
        System.out.println("Adaug aluat in BasePizza.(constructor cu nume)");
        ingredients.add(new Ingredient("aluat", 9));
        System.out.println("Adaug sos de rosii in BasePizza.(constructor cu nume)");
        ingredients.add(new Ingredient("sos de rosii", 1));
    }

    @Override
    public void addIngredient(Ingredient ingredient) {

        ingredients.add(ingredient);
        System.out.println("Adaug ingredient in BasePizza "+ ingredient + " ->" + ingredients);
    }

    @Override
    public int getCost() {
        int totalCost = 0;

        for (Ingredient ingredient: ingredients){
            totalCost = totalCost + ingredient.getCost();
        }
        System.out.println("calculez cost in BasePizza  " + totalCost);

        return totalCost;
    }

    @Override
    public void showIngredients() {
        System.out.println("ShowIngredients in BasePizza");
        System.out.println(ingredients);
    }

    @Override
    public void showPizzaName(){

        System.out.println("Nume pizza custom: " + pizzaCustomName);
    }

    @Override
    public String toString() {
        return "BasePizza{" +
                "pizzaCustomName='" + pizzaCustomName + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
