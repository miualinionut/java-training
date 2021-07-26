package code._2_bridge_design_pattern;

public class DinerOrders implements IOrderingSystem {

    public void Place(String order) {
        System.out.println("Placing order for " + order + " at the Diner.");
    }
}
