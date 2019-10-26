package code._0_activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity {

  public static void main(String[] args) {
    List<String> inputs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String input;
    System.out.println("Enter you input strings:");
    while (!(input = scanner.next()).equalsIgnoreCase("exit")) {
      inputs.add(input);
    }

    System.out.print(inputs);
  }
}
