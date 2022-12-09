package code._4_student_effort.challenge2;

import code._2_challenge._2_movie_database.Actor;
import code._2_challenge._2_movie_database.Film;
import code._2_challenge._2_movie_database.Premiu;
import code._2_challenge._2_movie_database.Studio;

public class DataBase {
public static Studio[] getData() {
    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new code._2_challenge._2_movie_database.Premiu[]{oscar1990, oscar2000});
    Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new code._2_challenge._2_movie_database.Premiu[]{oscar2010});
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new code._2_challenge._2_movie_database.Premiu[]{oscar2018});
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new code._2_challenge._2_movie_database.Premiu[]{});
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new code._2_challenge._2_movie_database.Premiu[]{});
    Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

    Film film1 = new Film(1990, "film cu actori de oscar", new code._2_challenge._2_movie_database.Actor[]{actorOscar1990, actorFaraPremii01});
    Film film2 = new Film(2010, "film cu actori fara premii2", new code._2_challenge._2_movie_database.Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film3 = new Film(2010, "film cu actori fara premii3", new code._2_challenge._2_movie_database.Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film4 = new Film(2018, "film cu actori de oscar", new code._2_challenge._2_movie_database.Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

    Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
    Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

    Studio[] studioDatabase = new Studio[]{studio1, studio2};

    return studioDatabase;
    }

    static public void moviesThatPublishedMoreThan2Movies()
    {
        System.out.print("Studios with more than two movies are:");
        for(Studio studio : getData())
            if(studio.filme.length > 2)
                System.out.println(studio.nume);

        System.out.println();

    }

    public static void printStudioNamesInWitchPlaysTheActorWithNameActorCu2Oscaruri()
    {
        System.out.print("Studio names in witch plays the actor with name actor cu 2 oscaruri are:");
        for(Studio studio : getData() )
            for(Film film : studio.filme)
                for(Actor actor : film.actori)
                    if(actor.nume.equals("actor cu 2 oscaruri"))
                        System.out.print(studio.nume + " ");
        System.out.println();
    }

    public static void movieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50()
    {
        System.out.print(" movie Names In Witch Plays At Least An Actor With Age Above 50:");
        for(Studio studio : getData() )
            for(Film film : studio.filme) {
                boolean more = false;
                for (Actor actor : film.actori)
                    if (actor.varsta > 50)
                    {
                        more = true;
                        break;
                    }
                if(more == true )
                    System.out.print(film.nume + ", ");
            }
        System.out.println();
    }
    public static void main(String[] args) {
        moviesThatPublishedMoreThan2Movies();
        printStudioNamesInWitchPlaysTheActorWithNameActorCu2Oscaruri();
        movieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50();
    }

}
