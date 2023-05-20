package clean.code.design_patterns.requirements;

public class Client3 extends Clients{
    @Override
    public boolean salad() {
        return true;
    }

    @Override
    public boolean sauce() {
        return false;
    }

    @Override
    public String typeOfSauce() {
        return null;
    }

    @Override
    public String typeOfMeat() {
        return "pui";
    }
}
