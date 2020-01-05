package code._4_student_effort;

public abstract class EnemyShipBuilding {


    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    // When called a new EnemyShip is made. The specific parts
    // are based on the String entered. After the ship is made
    // we execute multiple methods in the EnemyShip Object
    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();
        return theEnemyShip;

    }
}