package code._1_study._8_list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExample {

  public static void main(String[] args) {
    List<Integer> list01 = new ArrayList<>(); //random access, resizable
    List<Integer> list02 = new LinkedList<>(); //sequential access, no capacity limit
    List<Integer> list03 = new CopyOnWriteArrayList<>(); //fail-safe

    for (int i = 0; i < 10; i++) {
      list01.add(i);
      list02.add(i);
      list03.add(i);
    }

    display(list01);
    display(list02);
    display(list03);
  }

  private static void display(List<Integer> list) {
    for (Integer i : list) System.out.println(i);
  }
}
