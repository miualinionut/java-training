package clean.code.design_patterns.requirements.facade_pattern;

public class SpaceshipFacade {
    private LaserArsenal laserArsenal = new LaserArsenal();
    private ShieldGenerator shieldGenerator = new ShieldGenerator();
    private WarpEngine warpEngine = new WarpEngine();

    public void diagnoseSpaceship() {
        System.out.println("The ship is running a diagnosis:");
        laserArsenal.diagnoseLaserArsenal();
        shieldGenerator.diagnoseShieldGenerator();
        warpEngine.diagnoseWarpEngine();
    }

    public void attackEnemy() {
        System.out.println("The ship is attacking an enemy:");
        laserArsenal.enableLaser();
        laserArsenal.fireLaser();
        laserArsenal.setDamaged(true);

        shieldGenerator.enableShield(100);
        shieldGenerator.deflectAttack();
        shieldGenerator.setDamaged(true);
    }

    public void jumpTo(String destination) {
        System.out.println("The ship is jumping to a new location:");
        warpEngine.jumpTo(destination);
        shieldGenerator.enableShield(50);
        laserArsenal.disableLaser();
    }

    public void land() {
        System.out.println("The ship is landing:");
        warpEngine.powerOff();
        shieldGenerator.disableShield();
        laserArsenal.disableLaser();
    }

    public void takeoff() {
        System.out.println("The ship is taking off:");
        warpEngine.powerOn();
    }

    public void repair() {
        System.out.println("The ship is repairing:");
        warpEngine.setDamaged(false);
        shieldGenerator.setDamaged(false);
        laserArsenal.setDamaged(false);
    }
}
