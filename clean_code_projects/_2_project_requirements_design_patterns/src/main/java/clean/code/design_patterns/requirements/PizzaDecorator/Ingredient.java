package clean.code.design_patterns.requirements.PizzaDecorator;

public class Ingredient {
    private String name;
    private int cost;

    public Ingredient(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
