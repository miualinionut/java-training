package code._2_challenge._6_builder;

public class BuilderExample {

  public static void main(String[] args) {

    Person person01 = new Person.Builder("Popescu")
            .job("java developer")
            .university("FMI")
            .isMarried(false)
            .build();

    Person person02 = new Person.Builder("Ionescu")
            .drivingLicense("B")
            .isMarried(true)
            .build();
  }
}
