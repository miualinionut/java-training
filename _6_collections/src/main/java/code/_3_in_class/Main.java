package code._3_in_class;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.crypto.AEADBadTagException;
import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;

public class Main {

    /*public static void main(String[] args) {
        List<String> collectionofinputs = new ArrayList<String>();
        String input = null;
        Scanner scanner = new Scanner(System.in);
        while (!(input = scanner.next()).equalsIgnoreCase("exit")) {
            //TO DO
            collectionofinputs.add(input);
        }
        display(collectionofinputs);
    }

    private static void display(List<String> collectionofinputs) {
        for (String input : collectionofinputs)
          System.out.print(input + ",");
    }


    */
    public static void main(String[] args) {
      List list = new ArrayList<>();
      List checkedList = new ArrayList<>();
      List<String> checkedList = Collections.checkedList(list, String.class);
      checkedList.add("5");
      checkedList.add("3.14");
      checkedList.add("hello");

      display(list);
      displayUsingIterator();
    }

  private static void displayUsingIterator() {
      Iterator<String> iterator = list.iterator();
      while(iterator.hasNext()){
        String currentElement = iterator.next();
        System.out.println(currentElement);
      }
  }

  private static void display(List<String> list) {
      for(int i=0;i<list.size();i++){}

      for (String s: list)
        System.out.println(s);
  }
}
