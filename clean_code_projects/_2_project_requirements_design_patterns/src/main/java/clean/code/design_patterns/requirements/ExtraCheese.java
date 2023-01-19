package clean.code.design_patterns.requirements;

public class ExtraCheese extends FoodDecorator {
    public ExtraCheese(Food food) {
        super(food);
    }

    public double getPrice() {
        return food.getPrice() + 1;
    }

    public String getName() {
        return food.getName() + " with extra cheese";
    }
}
