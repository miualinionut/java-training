package clean.code.design_patterns2.requirements;

public class BridgePattern{
    public static void main(String[] args){
        Electronic e1 = new Phone(new Produce(), new Assemble());
        e1.manufacture();
        Electronic e2 = new Laptop(new Produce(), new Assemble());
        e2.manufacture();
    }
}
