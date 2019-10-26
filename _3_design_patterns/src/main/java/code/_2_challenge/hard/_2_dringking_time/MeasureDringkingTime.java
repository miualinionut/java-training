package code._2_challenge.hard._2_dringking_time;

public class MeasureDringkingTime {

  public static void main(String[] args) {
    IPerson person = new Person.Builder().setName("Duke").build();
    person.walk();
    person.drink();
  }
}


