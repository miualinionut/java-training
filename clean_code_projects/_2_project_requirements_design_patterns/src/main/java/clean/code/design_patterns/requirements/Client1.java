package clean.code.design_patterns.requirements;

public class Client1 extends Clients {

    @Override
    public boolean salad() {
        return true;
    }

    @Override
    public boolean sauce() {
        return true;
    }

    @Override
    public String typeOfSauce() {
        return "Maioneza";
    }

    @Override
    public String typeOfMeat() {
        return "Pui";
    }
}
