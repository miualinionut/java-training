package code._4_student_effort;

public class UFOEnemyShipFactory implements EnemyShipFactory {

    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();

    }
    public ESEngine addESEngine() {

        return new ESUFOEngine();
    }


    }
