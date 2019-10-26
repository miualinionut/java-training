package code._1_study._13_equals_hashcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsAndHashCodeExample {

  public static void main(String[] args) {
    Set<BadStudent> badStudents = new HashSet<>();
    Set<GoodStudent> goodStudents = new HashSet<>();

    for (int i = 0; i < 5; i++) {
      badStudents.add(new BadStudent("ion"));
      goodStudents.add(new GoodStudent("ion"));
    }

    System.out.println(goodStudents.size());
    System.out.println(badStudents.size());

  }

  static class BadStudent {
    public String name;

    public BadStudent(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object o) {
      return false;
    }

    @Override
    public int hashCode() {
      return 1;
    }

  }

  static class GoodStudent {
    public String name;

    public GoodStudent(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      GoodStudent that = (GoodStudent) o;
      return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name);
    }
  }
}
