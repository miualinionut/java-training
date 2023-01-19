package clean.code.design_patterns.requirements;

public class ExtraMeat extends FoodDecorator {
    public ExtraMeat(Food food) {
        super(food);
    }

    public double getPrice() {
        return food.getPrice() + 2;
    }

    public String getName() {
        return food.getName() + " with extra meat";
    }
}
