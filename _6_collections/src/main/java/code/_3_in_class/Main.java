package code._3_in_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    List<String> collectionsofInputs = new ArrayList<>();
    String input = null;

    Scanner scanner = new Scanner(System.in);
    while(!(input = scanner.next()).equalsIgnoreCase("exit")){
      collectionsofInputs.add(input);
    }
    display(collectionsofInputs);
  }

  private static void display(List<String> collectionsofInputs) {
    for(String e:collectionsofInputs){
      System.out.println(e);
    }
  }

  private static boolean weHaveTypedElements(Scanner scanner){

    String input = scanner.next();
    if(!input.equalsIgnoreCase("exit")){
      return true;
    }
    else
    {
      return false;
    }
  }
}