package code._1_study._2_heap_pollution;

import java.util.ArrayList;
import java.util.List;

public class HeapPollution {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");

    //list.add(Integer.valueOf(6));
    breakAList(list);

    System.out.println(list);
  }

  public static void breakAList(List list) {
    list.add(Integer.valueOf(1));
    list.add(Integer.valueOf(2));
    list.add(Integer.valueOf(3));
    list.add(Integer.valueOf(4));
    list.add(Integer.valueOf(5));
  }
}
