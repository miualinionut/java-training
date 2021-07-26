package code._2_bridge_design_pattern;

public class SendGlutenFreeOrder extends SendOrder {

    @Override
    public void Send() {
        _restaurant.Place("Gluten-Free Order");
    }
}
