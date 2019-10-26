package code._1_study._15_unmodifiable_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionExample {

  public static void main(String[] args) {
    unmodifiableOfReferences();

    unmodifiableOfPrimitives();
  }

  private static void unmodifiableOfReferences() {
    List<Person> list = new ArrayList<>();
    list.add(new Person("nicu"));
    list.add(new Person("relu"));
    list.add(new Person("gogu"));

    List<Person> unmodifiableList = Collections.unmodifiableList(list);
    Person personNicu = unmodifiableList.get(0);
    personNicu.name = "nicu2";

    System.out.println(list);
    System.out.println(unmodifiableList);
  }

  static class Person {
    public String name;

    public Person(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              '}';
    }
  }

  private static void unmodifiableOfPrimitives() {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 5; i++) list.add(i);

    List<Integer> unmodifiableList = Collections.unmodifiableList(list);
    System.out.println(unmodifiableList);

    unmodifiableList.set(0, 77); //throws UnsupportedOperationException
    System.out.println(unmodifiableList);

    unmodifiableList.add(6); //throws UnsupportedOperationException
    System.out.println(unmodifiableList);
  }

}
