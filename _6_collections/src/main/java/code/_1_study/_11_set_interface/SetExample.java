package code._1_study._11_set_interface;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetExample {

  public static void main(String[] args) {
    Collection<Integer> withDups = List.of(1, 1, 2, 1, 3, 2);
    System.out.println(withDups);
    System.out.println(removeDups(withDups));

    Set<Integer> set01 = new HashSet<>(); //O(1)
    Set<Integer> set02 = new TreeSet<>(); //O(lg n)
    Set<Integer> set03 = new LinkedHashSet<>(); //slower then TreeSet
    Set<Integer> set04 = new CopyOnWriteArraySet<>(); //fail-safe
  }

  public static <E> Set<E> removeDups(Collection<E> c) {
    return new LinkedHashSet<E>(c);
  }

}
