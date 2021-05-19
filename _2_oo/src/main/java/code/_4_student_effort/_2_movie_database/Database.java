package code._4_student_effort._2_movie_database;

public class Database {
    public static void main(String[] args) {
        Premiu p1 = new Premiu("Oscar",2000);
        Premiu p2 = new Premiu("Oscar", 1990);

        Actor a1 = new Actor("Actor 1", 51, new Premiu[] {p1});
        Actor a2 = new Actor("Actor cu 2 oscaruri", 25, new Premiu[]{});

        Film f1 = new Film(2000, "Film 1", new Actor[]{a1});
        Film f2 = new Film(2005, "Film 2", new Actor[]{a2});
        Film f3 = new Film(2010, "Film 3", new Actor[] {a1});

        Studio s1 = new Studio("Studio 1", new Film[]{f1});
        Studio s2 = new Studio("Studio 2", new Film[]{f2, f3});

        Studio[] studios = new Studio[] { s1, s2 };

        getStudioNamesWithMoreThan2Movies(studios);
        getStudioNameForActorWithNameActorCu2Oscaruri(studios);
        getMovieNameForAnActorAboveAge50(studios);
    }

    public static void getStudioNamesWithMoreThan2Movies(Studio[] studios) {
        for(Studio studio : studios) {
            if(studio.getFilme().length >= 2) {
                System.out.println("Studio with more than 2 movies: " + studio.getNume());
            }
        }
    }

    public static void getStudioNameForActorWithNameActorCu2Oscaruri(Studio[] studios)
    {
        for(Studio studio : studios) {
            for(Film film : studio.getFilme()) {
                for(Actor actor : film.getActori()) {
                    if(actor.getNume() == "Actor cu 2 oscaruri") {
                        System.out.println("Studio for Actor cu 2 oscaruri: " + studio.getNume());
                    }
                }
            }
        }
    }

    public static void getMovieNameForAnActorAboveAge50(Studio[] studios) {
        for(Studio studio : studios) {
            for(Film film : studio.getFilme()) {
                for(Actor actor : film.getActori()) {
                    if(actor.getVarsta() > 50) {
                        System.out.println("Movie for actor above age 50: " + film.getNume());
                    }
                }
            }
        }
    }
}
