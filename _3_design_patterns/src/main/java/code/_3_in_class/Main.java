package code._3_in_class;
import java.util.Scanner;

//Trebuia in student effort

public class Main {

    public static void main(String[] args) {
        //user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pentru iesirea din program tastati x.");
        while(true){
            System.out.print("Introduceți o varsta: ");
            int userInput = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Introduceți scoala: ");
            String userString = scanner.nextLine();
            if(userString.equals("x")) break;

            //System.out.println("Input-ul utilizatorului este: " + userInput);
            if (userInput < 30 && userInput > 0){
                GenZ genz = new GenZ(userString, userInput);
                genz.afisareGeneratie();
            }
            else if (userInput >= 30 && userInput <=60){
                Boomer boomer = new Boomer(userString, userInput);
                boomer.afisareGeneratie();
            }
        }
    }
}