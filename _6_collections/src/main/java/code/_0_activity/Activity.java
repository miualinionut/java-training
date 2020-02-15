package code._0_activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity {

  public static void main(String[] args) {
    List<String> s = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String input = null;
    System.out.println("Enter you input strings:");
    while (!(input = scanner.next()).equalsIgnoreCase("exit")) {
      s.add(input);
    }
    display(s);
  }

  private static void display(List<String> s) {
    for(String input: s){
      System.out.println(s + " ");
    }
  }
}
