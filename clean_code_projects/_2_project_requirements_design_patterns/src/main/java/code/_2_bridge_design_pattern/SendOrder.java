package code._2_bridge_design_pattern;

public abstract class SendOrder {

    public IOrderingSystem _restaurant;
    public abstract void Send();

}
