package code._1_study._3_fail_fast_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {

  public static void main(String[] args) {
    //Iterator supports only forward direction iteration
    //Iterator supports only remove operation

    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Strawberry");

    Iterator<String> fruitIterator = fruits.iterator(); //this is Fail-Fast iterator
    fruits.add("Watermelon"); //line that generates ConcurrentModificationException
    fruits.remove("Banana"); //another line that generates ConcurrentModificationException
    while (fruitIterator.hasNext()) {
      String fruitName = fruitIterator.next();
      System.out.println(fruitName); //ConcurrentModificationException here because list was changed after iterator was created (using modCount int to check number of changes)

      if (fruitName.equals("Strawberry")) {
        fruitIterator.remove();  //it is legal to remove items using the iterator, but not to alter the initial collection after the iterator was created
      }
    }
  }
}
