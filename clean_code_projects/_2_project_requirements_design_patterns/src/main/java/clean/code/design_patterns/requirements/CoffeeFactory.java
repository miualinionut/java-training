package clean.code.design_patterns.requirements;

public class CoffeeFactory{
    public static Coffee getCoffee(String type){
        if("Frappe".equals(type)){
            return new Frappe();
        }
        if("CaramelMacchiato".equals(type)){
            return new CaramelMacchiato();
        }
        if("CaffeLatte".equals(type)){
            return new CaffeLatte();
        }
        if("Cappuccino".equals(type)){
            return new Cappuccino();
        }

        return null;
    }
}