package code._4_student_effort;

public class BoxingMatch {
    Fighter player1;
    Fighter player2;
    BoxingMatch(Fighter p1, Fighter p2){
        player1 = p1;
        player2 = p2;
    }
    public String fight(){
        while(player1.health!=0&&player2.health!=0){
            player1.attack(player2);
            player2.attack(player1);
        }
        if(player1.health<=0){
            return player2.name;
        }else if(player2.health<=0){
            return player1.name;
        }
        return "Error! No winner";
    }

    public static void main(String[] args) {
        Fighter Andrei = new Fighter("Andrei", 150, 25);
        Fighter George = new Fighter("George", 100, 26);
        BoxingMatch heavyweightChampionship = new BoxingMatch(Andrei, George);
        System.out.println("The winner of the heavyweight championship is: " + heavyweightChampionship.fight());
    }
}
