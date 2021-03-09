package code._4_student_effort._decorator_pattern;

public class Cilantro extends CondimentDecorator {
    Taco taco;

    public Cilantro(Taco taco){
        this.taco = taco;
    }

    public String getDescription() {
        return taco.getDescription() + ", Cilantro";
    }

    public double cost() {
        return .10 + taco.cost();
    }
}