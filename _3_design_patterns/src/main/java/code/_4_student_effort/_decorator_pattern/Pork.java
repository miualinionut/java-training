package code._4_student_effort._decorator_pattern;

public class Pork implements Taco {
    public String description;

    public Pork(){
        description = "Pork taco";
    }
    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return 2.75;
    }
}