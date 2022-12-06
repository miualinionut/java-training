package code._4_student_effort;

import code._4_student_effort.challenge_2.Actor;
import code._4_student_effort.challenge_2.Film;
import code._4_student_effort.challenge_2.Premiu;
import code._4_student_effort.challenge_2.Studio;


public class Main {

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("Oscar", 1990);
        Premiu oscar2000 = new Premiu("Oscar", 2000);
        Premiu oscar2010 = new Premiu("Oscar", 2010);
        Premiu oscar2018 = new Premiu("Oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film("film cu actori de oscar", 1990, new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film("film cu actori fara premii 2", 2010, new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film("film cu actori fara premii 3", 2010, new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film("film cu actori de oscar", 2018, new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film("film cu actori fara premii 5", 2018, new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        for (Studio studio: studioDatabase)
            if (studio.getFilme().length > 2)
                System.out.println(studio.getNume());

        Film[] filmDatabase = new Film[]{film1, film2, film3, film4, film5};
        for (Film film: filmDatabase) {
            boolean containsActor = false;
            for (Actor actor: film.getActori())
                if (actor.getNume().equals("actor cu 2 oscaruri"))
                    containsActor = true;
            if (containsActor)
                System.out.println(film.getNume());
        }

        for (Film film: filmDatabase) {
            boolean containsActorOver50 = false;
            for (Actor actor: film.getActori())
                if (actor.getVarsta() > 50)
                    containsActorOver50 = true;
            if (containsActorOver50)
                System.out.println(film.getNume());
        }
    }
}
