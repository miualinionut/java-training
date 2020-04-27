package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
//    Fighter firstFighter = new Fighter("Leu", 23, 90);
//    Fighter secondFighter = new Fighter("Gorila", 18, 100);
//    BoxingMatch roundOne = new BoxingMatch(firstFighter, secondFighter);
//    System.out.println(roundOne.fight());

      Database studioDatabase = new Database();
      Studio allStudios[] = studioDatabase.getData();

      for (Studio studio : allStudios ) {
        if (studio.filme.length > 2) {
          System.out.println(studio.nume);
        }
      }

      for (Studio studio : allStudios) {
        for(Film film : studio.filme) {
          for (Actor actor : film.actori) {
            if (actor.nume.equals("actor cu 2 oscaruri")) {
              System.out.println(studio.nume);
            }
          }
        }
      }

      for (Studio studio : allStudios)
        for (Film film : studio.filme)
          for (Actor actor : film.actori) {
            if (actor.varsta > 50)
              System.out.println(film.nume);
          }
  }
}

