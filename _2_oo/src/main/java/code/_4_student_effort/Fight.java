package code._4_student_effort;

public class Fight extends  Fighter {
    private Fighter fighter1;
    private  Fighter fighter2;

    public Fight(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;

    }

    public static String fight(Fighter fighter1, Fighter fighter2){
        int i = 0;
        while (fighter1.health > 0 && fighter2.health > 0){
            if (i % 2 == 0){
                Fighter.attack(fighter1, fighter2);
            }
            else{
                Fighter.attack(fighter2, fighter1);
            }
            i++;
        }

        if(fighter1.health < 0)
            return fighter2.name;
        else return fighter1.name;

    }
    
    public static void main (String args[]){
         Fighter fighter1 = new Fighter("Fighter 1", 150, 14);
         Fighter fighter2 = new Fighter("Fighter 2", 200, 9);
         String output = " ";
         new Fight(fighter1, fighter2);

         output = Fight.fight(fighter1, fighter2);
        System.out.println(output + " is the winner");
    }
}
