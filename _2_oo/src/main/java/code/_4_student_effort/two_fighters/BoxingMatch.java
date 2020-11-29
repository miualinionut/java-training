package code._4_student_effort.two_fighters;

public class BoxingMatch {

    private  Fighter fighter1;
    private  Fighter fighter2;

    public  BoxingMatch(Fighter fighter1, Fighter fighter2){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public  String fight(){
        while(!fighterLost(fighter1.health) && !fighterLost(fighter2.health)){
            fighter1.attack(fighter2);
            if(fighterLost(fighter2.health)){
                return (fighter1.name);}
            fighter2.attack(fighter1);
        }
        return (fighter2.name);
    }

    private  boolean fighterLost(int health){
        if (health <= 0 ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter1", 100, 10);
        Fighter fighter2 = new Fighter("Fighter2", 100, 20);
        System.out.print(new BoxingMatch(fighter1, fighter2).fight());
    }
}
