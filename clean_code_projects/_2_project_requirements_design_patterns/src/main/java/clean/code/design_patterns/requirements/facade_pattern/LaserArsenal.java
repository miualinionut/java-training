package clean.code.design_patterns.requirements.facade_pattern;

public class LaserArsenal {
    private boolean enabled = false, damaged = false;

    public void fireLaser() {
        if (damaged)
            System.out.println("The laser is damaged and cannot fire");
        else
            System.out.println("The laser destroyed the target");
    }

    public void diagnoseLaserArsenal() {
        System.out.println("Laser arsenal status: enabled = " + enabled + ", damaged = " + damaged);
    }

    public void enableLaser() {
        System.out.println("The lasers are ready to fire");
        enabled = true;
    }

    public void disableLaser() {
        System.out.println("The lasers are disabled");
        enabled = false;
    }

    public void setDamaged(boolean damaged) {
        System.out.println("The lasers are damaged");
        this.damaged = damaged;
    }
}
