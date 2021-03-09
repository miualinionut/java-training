package code._4_student_effort._decorator_pattern;

public class Avocado extends CondimentDecorator {
    Taco taco;

    public Avocado(Taco taco){
        this.taco = taco;
    }

    public String getDescription() {
        return taco.getDescription() + ", Avocado";
    }

    public double cost() {
        return .90 + taco.cost();
    }
}