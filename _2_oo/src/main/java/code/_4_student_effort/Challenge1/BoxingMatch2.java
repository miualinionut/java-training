package code._4_student_effort.Challenge1;

public class BoxingMatch2 {

    Fighter2 fighter1;
    Fighter2 fighter2;
    public BoxingMatch2(Fighter2 fighter1, Fighter2 fighter2){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public static void main(String[] args) {

        Fighter2 f1 = new Fighter2("Astro", 100, 30);
        Fighter2 f2 = new Fighter2("Tasha",100, 30);
        BoxingMatch2 box = new BoxingMatch2(f1, f2);
        String winner = box.fight();
        System.out.println(winner);

    }
    public String fight(){

        String s = "";
        while((fighter1.health > 0) && (fighter2.health > 0))
        {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if(fighter1.health >= 0)
            s += fighter1.name;
        else
            s += fighter2.name;
        return s;
    }
}
