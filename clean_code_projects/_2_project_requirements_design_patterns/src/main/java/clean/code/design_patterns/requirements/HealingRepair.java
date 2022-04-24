package clean.code.design_patterns.requirements;

public class HealingRepair implements IRepair{
    @Override
    public void repair() {
        System.out.println("This repair is based on medKits");
    }
}
