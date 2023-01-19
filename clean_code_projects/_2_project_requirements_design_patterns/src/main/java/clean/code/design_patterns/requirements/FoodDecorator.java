package clean.code.design_patterns.requirements;

public abstract class FoodDecorator implements Food {
    protected Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }

    public double getPrice() {
        return food.getPrice();
    }

    public String getName() {
        return food.getName();
    }
}
