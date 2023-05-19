package clean.code.design_patterns.requirements.decorator;

public class Appetizer implements Food {

    @Override
    public String prepareFood(){
        return "Appetizer";
    }

    @Override
    public double foodPrice(){
        return 25.0;
    }
}