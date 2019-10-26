package code._1_study._14_ordering;

import java.util.Arrays;
import java.util.Comparator;

public class OrderingExample {

  public static void main(String[] args) {
    sortUsingIntegerNaturalOrder();
    sortUsingPersonNaturalOrder();
    sortUsingPersonCustomOrder();
  }

  private static void sortUsingPersonNaturalOrder() {
    Person[] persons = new Person[]{
            new Person("vasi", 15),
            new Person("popa", 26),
            new Person("nicu", 18)
    };
    Arrays.sort(persons);
    display(persons);
  }

  private static void sortUsingPersonCustomOrder() {
    Person[] persons = new Person[]{
            new Person("nicu", 15),
            new Person("popa", 26),
            new Person("vasi", 18)
    };
    Arrays.sort(persons, Person.byAge);
    display(persons);
  }

  private static void sortUsingIntegerNaturalOrder() {
    Integer[] integers = {2, 5, 1, 3, 4, 7, 6, 8, 9};
    Arrays.sort(integers);
    display(integers);
  }

  private static void display(Object[] arr) {
    System.out.println("---------");
    for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);
  }

  static class Person implements Comparable<Person> {
    public String name;
    public Integer age;
    public static Comparator byAge = new Comparator<Person>() {
      @Override
      public int compare(Person p1, Person p2) {
        return p1.age.compareTo(p2.age);
      }
    };

    public Person(String name, Integer age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public int compareTo(Person p) {
      return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
    }
  }

}
