package code._4_student_effort.challenge6;

public class Main {

  public static void main(String[] args) {

    Person persoana = new Person.PersonBuilder("Bogdan").setUniversity("Politehnica").setJob("Programator").setIsMarried(false).setDrivingLicense(true).build();

    System.out.println(persoana);
  }
}
