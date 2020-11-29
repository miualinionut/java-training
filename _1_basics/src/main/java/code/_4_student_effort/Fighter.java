package code._4_student_effort;
import java.util.Scanner;
public class Fighter {

    String name;
    int health;
    int damagePerAttack;

    //Constructor
    public Fighter(String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    //Attack function
    static void attack(Fighter opponent1, Fighter opponent2){
        opponent1.health = opponent1.health - opponent2.damagePerAttack;

    }

    //Main
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Introduceti datele primului luptator: ");
        System.out.print("Nume: ");
        String player1name = myObj.nextLine();
        System.out.print("Introduceti viata primului luptator: ");
        int player1hp = myObj.nextInt();
        System.out.print("Introduceti dmg primului luptator: ");
        int player1dmg = myObj.nextInt();

        Scanner myAlex = new Scanner(System.in);
        System.out.println("Introduceti datele celui de al doilea luptator: ");
        System.out.print("Nume: ");
        String player2name = myAlex.nextLine();
        System.out.print("Introduceti viata celui de al doilea luptator: ");
        int player2hp = myAlex.nextInt();
        System.out.print("Introduceti dmg celui de al doilea luptator: ");
        int player2dmg = myAlex.nextInt();


        Fighter player1 = new Fighter(player1name, player1hp,player1dmg);
        Fighter player2 = new Fighter(player2name, player2hp, player2dmg);
        BoxingMatch box= new BoxingMatch(player1, player2);
        box.fight();
    }

}
