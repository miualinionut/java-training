package code._4_student_effort._decorator_pattern;

public class Veggie implements Taco {
    public String description;

    public Veggie(){
        description = "Veggie taco";
    }
    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return 3.99;
    }
}