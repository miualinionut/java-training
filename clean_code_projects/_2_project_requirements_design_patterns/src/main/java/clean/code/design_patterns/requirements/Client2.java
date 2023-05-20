public class Client2 extends Clients {
    @Override
    public boolean milk() {
        return false;
    }

    @Override
    public boolean flavour() {
        return true;
    }

    @Override
    public String typeOfFlavour() {
        return "caramel";
    }

    @Override
    public String typeOfCup() {
        return "mic";
    }
}
