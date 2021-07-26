package code._2_bridge_design_pattern;

public class Main {
    public static void main(String[] args) {
        SendOrder _sendOrder = new SendDairyFreeOrder();
        _sendOrder._restaurant = new DinerOrders();
        _sendOrder.Send();

        _sendOrder._restaurant = new FancyRestaurantOrders();
        _sendOrder.Send();

        _sendOrder = new SendGlutenFreeOrder();
        _sendOrder._restaurant = new DinerOrders();
        _sendOrder.Send();
    }
}
