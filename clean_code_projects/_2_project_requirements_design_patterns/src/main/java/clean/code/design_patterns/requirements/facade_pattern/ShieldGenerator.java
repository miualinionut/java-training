package clean.code.design_patterns.requirements.facade_pattern;

public class ShieldGenerator {
    private boolean damaged = false;
    private int power = 0;

    public void deflectAttack() {
        if (damaged)
            System.out.println("The shield is too damaged to deflect attacks");
        else
            System.out.println("The shield generator deflected an incoming projectile");
    }

    public void enableShield(int power) {
        System.out.println("Activating shield");
        this.power = power;
    }

    public void disableShield() {
        System.out.println("Shields are down");
        power = 0;
    }

    public void diagnoseShieldGenerator() {
        System.out.println("Shield generator status: power = " + power + ", damaged = " + damaged);
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }
}
