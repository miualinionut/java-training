package code._4_student_effort._decorator_pattern;

public class Onion extends CondimentDecorator {
    Taco taco;

    public Onion(Taco taco){
        this.taco = taco;
    }

    public String getDescription() {
        return taco.getDescription() + ", Onion";
    }

    public double cost() {
        return .10 + taco.cost();
    }
}