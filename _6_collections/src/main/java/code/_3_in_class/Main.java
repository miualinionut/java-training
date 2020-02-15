package code._3_in_class;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] s = new String[0];
        String input = null;

        Scanner scanner = new Scanner(System.in);
//    while (weHaveTypedNewElements(scanner)){}

//        while (!(input = scanner.next()).equalsIgnoreCase("exit")) {
//            String[] copyS = new String[s.length + 1];
//            for (int i = 0; i < s.length; i++) {
//                copyS[i] = s[i];
//            }
//            s = copyS;
//            int pos = s.length - 1;
//            s[pos] = input;
//        }
      //sau
      while(!(input = scanner.next()).equalsIgnoreCase("exit")) {
        int nrOfElm = s.length+1;
        s = Arrays.copyOf(s, nrOfElm);

        int pos = s.length - 1;
        s[pos] = input;
      }
        display(s);
    }

    private static void display(String[] s) {
        for (String input : s) {
            System.out.print(input + " ");
        }
    }

    private static boolean weHaveTypedNewElements(Scanner scanner) {
        String input = scanner.next();

        if (input.equalsIgnoreCase("exit")) {
            return false;
        } else {
            return true;
        }

    }
}