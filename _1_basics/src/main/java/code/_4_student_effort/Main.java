package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Map<String, Command> commands = new HashMap<>();
        commands.put("fizzbuzz", new StudentFizzBuzz());
        commands.put("foobarqix", new StudentFooBarQix());
        commands.put("pair2", new StudentPairOf2());
        commands.put("pair3", new StudentPairOf3());

        Scanner input = new Scanner(System.in);
        String[] command;
        String key = "";
        int arg;
        while (!(key.equals("exit"))) {
            System.out.println("\nChoose a function and a max number (for iterations and array sizes):" +
                    "\nFizzBuzz n" +
                    "\nFooBarQix n" +
                    "\nPair2 n" +
                    "\nPair3 n");
            command = input.nextLine().split(" ");
            key = command[0].toLowerCase();
            arg = Integer.parseInt(command[1]);
            commands.get(key).exec(arg);
        }
    }

}
