package clean.code.design_patterns.requirements;

public class LongRangeAttack implements IAttack {

    @Override
    public void attack() {
        System.out.println("Attacking from distance");
    }
}
