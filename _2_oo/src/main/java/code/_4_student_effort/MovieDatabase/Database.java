package code._4_student_effort.MovieDatabase;

public class Database {
    public static Studio[] getData() {
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2001 = new Premiu("oscar", 2001);
        Premiu oscar2018 = new Premiu("oscar", 2018);
        Premiu oscar2003 = new Premiu("oscar", 2003);

        Actor actorOscar2000 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar2003, oscar2001});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 44, new Premiu[]{oscar2000});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 31, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar", 22, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar", 29, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar", 55, new Premiu[]{});

        Film film1 = new Film(2000, "film cu actori de oscar", new Actor[]{actorOscar2000, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii 01", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii 02", new Actor[]{actorOscar2000, actorFaraPremii01});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018});
        Film film5 = new Film(2018, "film cu actori fara premii 03", new Actor[]{actorFaraPremii01, actorFaraPremii02});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("MGM", new Film[]{film3, film4, film5});

        Studio[] studios = new Studio[]{studio1, studio2};
        return studios;
    }

    public static void getStudioNames() {

        for (Studio studios : getData()) {
            if (studios.filme.length > 2) {
                System.out.println(studios.nume);
            }
        }
    }

    public static void getStudioNamesWithActorsWith2Oscars() {

        for (Studio studios : getData()) {
            for (Film film : studios.filme) {
                for (Actor actor : film.actori) {
                    if (actor.nume == "actor cu 2 oscaruri") {
                        System.out.println(studios.nume);
                    }
                }
            }
        }
    }

    public static void getStudioNamesWithActorsAbove20() {

        for (Studio studios : getData()) {
            for (Film film : studios.filme) {
                for (Actor actor : film.actori) {
                    if (actor.varsta > 20 ) {
                        System.out.println(studios.nume);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        getStudioNamesWithActorsAbove20();
    }

}
