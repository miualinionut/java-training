package code._3_in_class;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter your input strings: ");
        while (!(input = scanner.next()).equalsIgnoreCase("exit")) {
            inputs.add(input);
        }

        for(String s: inputs) {
            System.out.println(s + ", ");
        }
    }
}