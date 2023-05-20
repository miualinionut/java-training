public class Client1 extends Clients {

    @Override
    public boolean milk() {
        return true;
    }

    @Override
    public boolean flavour() {
        return true;
    }

    @Override
    public String typeOfFlavour() {
        return "vanilie";
    }

    @Override
    public String typeOfCup() {
        return "mare";
    }
}
