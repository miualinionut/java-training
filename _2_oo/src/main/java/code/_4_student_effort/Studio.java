package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;

public class Studio {

    String nume;
    Film [] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }


    boolean isPopular() {
        return (filme.length > 2);
    }

    ArrayList<Film> getFilmWithActor(String name) {
        ArrayList<Film> filmWithActor = new ArrayList<>();
        for (Film film : filme) {
            if (film.hasActor(name)) {
                filmWithActor.add(film);
            }
        }
        return filmWithActor;
    }

    boolean playedActor(String name) {
        for (Film film : filme) {
            if (film.hasActor(name)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        System.out.println("Studiouri in care s-au produs mai multe de 2 filme:");
        ArrayList<String> popularStudios = new ArrayList<>();
        for (Studio studio : studioDatabase) {
            if (studio.isPopular()) {
                popularStudios.add(studio.nume);
                System.out.println(studio.nume + " ");
            }
        }

        String actorName = "actor cu 2 oscaruri";
        System.out.println("\nStudiouri in care a fost \"" + actorName + "\":");

        for (Studio studio : studioDatabase) {
            if (studio.playedActor(actorName)) {
                System.out.println(studio.nume);
            }
        }

//        for (Studio studio : studioDatabase) {
//            if (studio.getFilmWithActor(actorName).size() > 0) {
//                System.out.println(studio.nume + ", ");
//            }
//        }
        System.out.println("\nFilme in care joaca actori de peste 50 de ani:");

        Film [] Filme = {film1, film2, film3, film4, film5};
        //ArrayList<Film> filmsWithOldActors = new ArrayList<>();
        for (Film film : Filme) {
            if (film.hasOldActors()) {
                //filmsWithOldActors.add(film);
                System.out.println(film.nume + " ");
            }
        }

    }
}
