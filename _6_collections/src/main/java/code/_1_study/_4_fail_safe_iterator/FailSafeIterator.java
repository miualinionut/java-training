package code._1_study._4_fail_safe_iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

  public static void main(String[] args) {
    //Iterator supports only forward direction iteration
    //Iterator supports only remove operation

    List<String> fruits = new CopyOnWriteArrayList<>(); //ConcurrentHashMap is also fail-safe
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Strawberry");

    Iterator<String> fruitIterator = fruits.iterator(); //this is Fail-Safe iterator
    fruits.add("Watermelon"); //line that changes initial collection, but change will not be visible in iterator
    fruits.remove("Banana"); //line that changes initial collection, but change will not be visible in iterator
    while (fruitIterator.hasNext()) {
      String fruitName = fruitIterator.next();
      System.out.println(fruitName); //will print only the values present in the collection when the iterator was created

      if (fruitName.equals("Strawberry")) {
        fruitIterator.remove();  //will generate UnsupportedOperationException
      }
    }

    System.out.println(fruits);
  }
}
