package code._2_challenge._9_my_set;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class MySetChallenge {

  public static void main(String[] args) {
    Collection<Integer> withDups = List.of(1, 1, 2, 1, 3, 2);

    MySet<Integer> mySet = new MySetImpl<>();
    for(Integer i: withDups) {
        mySet.add(i);
    }

    for(int i=0;i<mySet.size();i++) {
      System.out.println(mySet.get(i));
    }
  }
}
