package clean.code.design_patterns.requirements.decorator;

public class SpanishFood extends Decorator {
    public SpanishFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With Gazpacho and Paella";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+ 82.75;
    }
}