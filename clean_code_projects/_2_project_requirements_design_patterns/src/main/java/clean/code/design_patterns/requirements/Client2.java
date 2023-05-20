package clean.code.design_patterns.requirements;

public class Client2 extends Clients{
    @Override
    public boolean salad() {
        return false;
    }

    @Override
    public boolean sauce() {
        return true;
    }

    @Override
    public String typeOfSauce() {
        return "barbecue";
    }

    @Override
    public String typeOfMeat() {
        return "vita";
    }
}

