package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.print("Input the number of documents: ");
        int number = input.nextInt();
        input.nextLine();

        ArrayList <Document> documents = new ArrayList<Document>();
        for (int i = 0; i < number; ++i) {
            System.out.print("Input type: ");
            String temp = input.nextLine();
            documents.add(DocumentFactory.createDocument(temp));
        }

        for (int i = 0; i < number; ++i) {
            System.out.print("Document number " + (i + 1) + " type is: ");
            System.out.println(documents.get(i).requestDocType() + ".");

            System.out.println("This specific type of document allows a maximum size of ");
            System.out.println(documents.get(i).requestMaxSize() + " GB.");

            System.out.println("So far there have been " + documents.get(i).requestNumberOfDocs());
            System.out.println(" documents of this type created.");
            System.out.println();
        }*/



        /*System.out.print("Input your name: ");
        String full_name = input.nextLine();
        System.out.print("Input today's date: ");
        String creation_time = input.nextLine();
        KauflandCard card = KauflandCard.getCard(full_name, creation_time);

        card.addPoints(234);
        KauflandCard.addPoints(44);
        KauflandCard.pointsLeft();
        System.out.println();

        card.usePoints(15);
        KauflandCard.usePoints(45);
        KauflandCard.pointsLeft();
        System.out.println();

        card.description();*/
    }
}