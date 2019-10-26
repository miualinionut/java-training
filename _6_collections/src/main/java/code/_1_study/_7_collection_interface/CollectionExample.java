package code._1_study._7_collection_interface;

import java.util.Collection;
import java.util.List;

public class CollectionExample {

  public static void main(String[] args) {
    Collection collection = List.of(1, 2, 3, 4, 5);

    int size = collection.size(); //because the returned type is int, does this mean that a collection can hold maximum nr of elements of Integer.MAX_VALUE
    System.out.println(size);

  }
}
