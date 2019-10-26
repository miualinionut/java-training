package code._1_study._2_remove_in_loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveInLoop {

  public static void main(String[] args) {
    removeInForLoop(getListOfFruits());

    //changing the structure while iterating, might conclude to wrong results
    //removing after an iterator was created and then trying to use that iterator will result in
    //ConcurrentModificationException being thrown
    //removeInEnhancedForLoop(getListOfFruits());

    rightWayOfRemovingWhiteLooping(getListOfFruits());
  }

  private static List<String> getListOfFruits() {
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Strawberry");

    return fruits;
  }

  private static void removeInForLoop(List<String> fruits) {
    for (int i = 0; i < fruits.size(); i++) {
      if ("Apple".equals(fruits.get(i))) {
        fruits.remove(i);
      } else {
        System.out.println(fruits.get(i));
      }
    }
  }

  private static void removeInEnhancedForLoop(List<String> fruits) {
    for (String fruit : fruits) {
      if ("Apple".equals(fruit)) {
        fruits.remove(fruit);
      } else {
        System.out.println(fruit);
      }
    }
  }

  private static void rightWayOfRemovingWhiteLooping(List<String> fruits) {
    Iterator<String> fruitIterator = fruits.iterator();
    while (fruitIterator.hasNext()) {
      String fruit = fruitIterator.next();
      if ("Apple".equals(fruit)) {
        fruitIterator.remove();
      } else {
        System.out.println(fruit);
      }
    }
  }
}
