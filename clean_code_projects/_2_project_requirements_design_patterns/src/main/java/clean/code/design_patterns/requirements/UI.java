package clean.code.design_patterns.requirements;

import java.util.Collections;
import java.util.Scanner;

public class UI {
    //private static UI instance = new UI();
    private databaseJucatori db = databaseJucatori.getInstance();
    private dbIterator iterator;

    //make the constructor private so that this class cannot be
    //instantiated
    public UI(){}

    public void menu(){
        System.out.println("1.Afisare jucatori");
        System.out.println("2.Afisare castigator balon de aur sezon 2022-2023");
        System.out.println("3.Exit");
    }
    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            menu();
            System.out.print("Alegeti optiune: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput == 3)
            {
                break;
            }

            else if (userInput == 1)
            {   iterator = new dbIterator(db.getAllObjects());
                while (iterator.hasNext())
                {
                    jucatorFotbal item = iterator.next();
                    System.out.println(item);
                }
            } else if (userInput == 2) {
                iterator = new dbIterator(db.getAllObjects());
                float rating = 0f;
                boolean findCastigarot = false;
                while (iterator.hasNext())
                {
                    jucatorFotbal item = iterator.next();
                    if(item.ratingJucator() >= rating) rating = item.ratingJucator();
                    //System.out.println(rating);
                }
                //System.out.println(rating);
                iterator = new dbIterator(db.getAllObjects());
                while (!findCastigarot && iterator.hasNext()){
                    jucatorFotbal item = iterator.next();
                    if(rating == item.ratingJucator()) {
                        System.out.println(item.getNume() + "este castigatorul balonului de aur cu un rating de:" +item.ratingJucator());
                        findCastigarot = true;
                    }
                }
            }

        }
    }

}
