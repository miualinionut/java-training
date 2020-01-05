package code._4_student_effort;

public class UFOBossEnemyShipFactory implements EnemyShipFactory{
    public ESWeapon addESGun() {
        return new ESUFOBossGun(); // Specific to Boss UFO
    }
        // Defines the engine object to associate with the ship
    public ESEngine addESEngine() {
        return new ESUFOBossEngine(); // Specific to Boss UFO
    }

}
