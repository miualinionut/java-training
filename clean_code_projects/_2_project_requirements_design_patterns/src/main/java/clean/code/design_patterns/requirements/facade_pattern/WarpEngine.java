package clean.code.design_patterns.requirements.facade_pattern;

public class WarpEngine {
    private boolean damaged = false, turbo = false;
    private int power = 0;
    private String destination;

    public void powerOff() {
        System.out.println("The engine is powering off");
        turbo = false;
        power = 0;
    }

    public void powerOn() {
        System.out.println("The engine is powering on");
        turbo = false;
        power = 100;
    }

    public void jumpTo(String destination) {
        if (damaged) {
            System.out.println("The warp engine is damaged, we cannot jump anywhere");
        } else {
            System.out.println("The engine is jumping to " + destination);
            this.destination = destination;
            turbo = true;
            power = 200;
        }
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public void diagnoseWarpEngine() {
        System.out.println("Warp engine status: destination: " + destination + ", power = " + power + ", turbo: " + turbo + ", damaged = " + damaged);
    }
}
