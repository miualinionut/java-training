package code._4_student_effort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    List list = new ArrayList<>();
    List<String> checkedList = Collections.checkedList(list, String.class);
    checkedList.add("5");
    checkedList.add("3.14");
    checkedList.add("hello");

    display(list);
    System.out.println("-------------------");
    displayUsingIterator(list);
  }
  public static void display(List<String> list){
    for (String s: list) System.out.print(s);
  }
  public static void displayUsingIterator(List<String> list){
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()){
      String currentElement = iterator.next();
      System.out.println(currentElement);
    }
  }
}
