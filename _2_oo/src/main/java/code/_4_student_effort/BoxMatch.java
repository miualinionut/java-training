package code._4_student_effort;

import java.util.Random;

public class BoxMatch {
    private DefensiveFighter Mayweather;
    private OffensiveFighter MikeTyson;

    public BoxMatch(DefensiveFighter Mayweather, OffensiveFighter MikeTyson) {
        this.Mayweather = Mayweather;
        this.MikeTyson = MikeTyson;
    }

    public static void main(String[] args) {
        DefensiveFighter Mayweather = new DefensiveFighter("Money Mayweather", 25, 115,0);
        OffensiveFighter MikeTyson = new OffensiveFighter("Mike Tyson", 45, 150,0);
        BoxMatch boxingMatch=new BoxMatch(Mayweather,MikeTyson);
        String winner=boxingMatch.fight();
        System.out.println(winner+" has won !\n");
    }

    public String fight() {
        while (Mayweather.health > 0 && MikeTyson.health > 0) {
            Random random= new Random();
            int chance=random.nextInt(2);

            if(chance==0){
                Mayweather.attack(MikeTyson);
            }else MikeTyson.attack(Mayweather);
        }
        if (Mayweather.health <= 0) {
            return MikeTyson.name;
        } else {
            return Mayweather.name;
        }
    }
}