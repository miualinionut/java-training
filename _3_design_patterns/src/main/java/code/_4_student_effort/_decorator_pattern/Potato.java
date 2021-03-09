package code._4_student_effort._decorator_pattern;

public class Potato extends CondimentDecorator {
    Taco taco;

    public Potato(Taco taco){
        this.taco = taco;
    }

    public String getDescription() {
        return taco.getDescription() + ", Potato";
    }

    public double cost() {
        return .30 + taco.cost();
    }
}