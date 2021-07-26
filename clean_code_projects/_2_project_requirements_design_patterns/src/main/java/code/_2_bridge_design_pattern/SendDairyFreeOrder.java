package code._2_bridge_design_pattern;

public class SendDairyFreeOrder extends SendOrder {

    @Override
    public void Send() {
        _restaurant.Place("Dairy-Free Order");
    }
}
