package code._4_student_effort._1_two_fighters;


public class BoxingMatch {
    Fighter fighterA;
    Fighter fighterB;

    public BoxingMatch(Fighter... fighters) {
        if (fighters.length != 2)
            throw new IllegalArgumentException("There must be two fighters!");
        this.fighterA = fighters[0];
        this.fighterB = fighters[1];
    }

    /**
     * Trough complex methods of blackmail, the two fighters are forced to unwillingly fight each other to the death.
     *
     * @return the name of the winning fighter
     */
    public String fight() {
        while (fighterA.isAlive() && fighterB.isAlive()) {
            fighterA.attack(fighterB);
            fighterB.attack(fighterA);
        }
        if (fighterA.isAlive())
            return fighterA.getName();
        return fighterB.getName();

    }

    public String fightDetailed() {
        while (fighterA.isAlive() && fighterB.isAlive()) {
            fighterA.attackDetailed(fighterB);
            fighterB.attackDetailed(fighterA);
        }
        if (fighterA.isAlive())
            return fighterA.getName() + " HAS WON THE FIGHT!\n" + fighterB.getName() + " IS DEAD...\n";
        return fighterB.getName() + " HAS WON THE FIGHT!\n" + fighterA.getName() + " IS DEAD...\n";
    }
}
