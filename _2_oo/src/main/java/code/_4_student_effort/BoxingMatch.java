package code._4_student_effort;
import java.util.Random;

public class BoxingMatch extends Fighter{
    Fighter f1;
    Fighter f2;
    BoxingMatch(Fighter f1,Fighter f2) {
        this.f1=f1;
        this.f2=f2;
    }

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Alex",100, 20);
        Fighter f2 = new Fighter("Kike", 100, 20);

        System.out.println(fight(f1, f2));
        //System.out.println(f1.attack(f2));
        //System.out.println(f2.attack(f1));
    }

    public static String fight(Fighter f1, Fighter f2){
        Random randomGen = new Random();
        while (f1.life() && f2.life()) {
            int Ordine = randomGen.nextInt(2);
            if(Ordine == 1){
                f1.attack(f2);
            System.out.println(f2.name + " viata"  + " " + f2.health);
            }
            else{
                f2.attack(f1);
            System.out.println(f1.name + " viata " + f1.health);
            }
        }
        if(f1.health > 0){
            return "Castigator " + f1.name;}
        if(f1.health == f2.health)
            return "Egal";
        return "Castigator: " + f2.name;

    }

}
