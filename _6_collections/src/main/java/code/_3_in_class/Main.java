package code._3_in_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      List<String> collectionOfInputs = new ArrayList<>();
        String input = null;
        System.out.println("Introduceti valorile:");
        Scanner scanner = new Scanner(System.in);

        while (!(input = scanner.next()).equalsIgnoreCase("exit")) {
            collectionOfInputs.add(input);
        }
        display(collectionOfInputs);
    }
    private static void display (List <String> collectionOfInputs) {
        for (String input : collectionOfInputs)
            System.out.print(input + ",");
    }

}