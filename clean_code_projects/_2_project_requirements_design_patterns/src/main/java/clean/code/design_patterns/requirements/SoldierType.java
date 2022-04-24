package clean.code.design_patterns.requirements;

public class SoldierType {
    String name;
    IRefill refill;
    IRepair repair;
    IAttack attack;

    public SoldierType(String name,IRefill refill, IRepair repair, IAttack attack) {
        this.name=name;
        this.refill = refill;
        this.repair = repair;
        this.attack = attack;
    }
}
