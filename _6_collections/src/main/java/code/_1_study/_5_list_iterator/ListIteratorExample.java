package code._1_study._5_list_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

  public static void main(String[] args) {
    //ListIterator supports all CRUD operations
    //ListIterator is bidirectional

    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Strawberry");

    ListIterator<String> listIterator = fruits.listIterator(); //ListIterator has no current element, it's cursor position lies between elements
    listIterator.add("Watermelon"); //will move forward the cursor position by 1
    System.out.println("----- forward iteration");
    while(listIterator.hasNext()){
      System.out.println(listIterator.next());
    }
    System.out.println("----- backwards iteration");
    while(listIterator.hasPrevious()){
      System.out.println(listIterator.previous());
    }
    System.out.println("----- original list");
    System.out.println(fruits);

    listIterator.set("Cherries"); //will replace last returned element from next/previous with something else
    System.out.println("----- original list");
    System.out.println(fruits);
  }
}
