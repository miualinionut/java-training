public class Client3 extends Clients {
    @Override
    public boolean milk() {
        return true;
    }

    @Override
    public boolean flavour() {
        return false;
    }

    @Override
    public String typeOfFlavour() {
        return null;
    }

    @Override
    public String typeOfCup() {
        return "mare";
    }
}
