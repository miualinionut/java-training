package code._1_study._12_map_interface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

  public static void main(String[] args) {
    Map<Integer, String> map01 = new HashMap<>();
    Map<Integer, String> map02 = new TreeMap<>();
    Map<Integer, String> map03 = new LinkedHashMap<>();

    Integer[] integers = new Integer[]{1, 1, 2, 3, 4, 5};
    String[] strings = new String[]{"one", "one", "two", "three", "four", "five"};

    for (int i = 0; i < integers.length; i++) {
      map01.put(integers[i], strings[i]);
      map02.put(integers[i], strings[i]);
      map03.put(integers[i], strings[i]);
    }

    display(map01);
    display(map02);
    display(map03);

  }

  static void display(Map<Integer, String> map) {
    System.out.println("------------");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }
}
