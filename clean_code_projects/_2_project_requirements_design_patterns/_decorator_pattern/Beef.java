package code._4_student_effort._decorator_pattern;

public class Beef implements Taco {

    public String description;

    public Beef(){
        description = "Beef taco";
    }

    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return 2.99;
    }
}