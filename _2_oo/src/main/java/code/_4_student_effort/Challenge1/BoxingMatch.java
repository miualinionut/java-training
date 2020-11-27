package code._4_student_effort.Challenge1;
//stage2
public class BoxingMatch {
    public Fighter Player1;
    public Fighter Player2;

    //constructor
    public BoxingMatch(Fighter P1, Fighter P2) {
        this.Player1 = P1;
        this.Player2 = P2;
    }

    //Return Winner
    public String fight() {
        while(Player1.health > 0 && Player2.health > 0){
            Player1.Attack(Player2);
            Player2.Attack(Player1);
        }if(Player1.health > Player2.health){
            return Player1.name;
        }else return Player2.name;
    }
}
