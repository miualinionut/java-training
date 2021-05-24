package code._4_student_effort.MovieDatabase;

public class Database {
    public static Studio[] getData(){
        Premiu oscar1990 = new Premiu("Oscar",1990);
        Premiu oscar2000 = new Premiu("Oscar",2000);
        Premiu oscar2010 = new Premiu("Oscar", 2010);
        Premiu oscar2020 = new Premiu("Oscar",2020);

        Actor stuartReid = new Actor("Stuart Reid", 37, new Premiu[]{oscar2010,oscar2020});
        Actor basilGray = new Actor("Basil Gray", 42, new Premiu[]{oscar1990,oscar2000,oscar2010});
        Actor britneyMoore = new Actor("Britney Moore", 33, new Premiu[]{oscar2020});
        Actor howardKennedy = new Actor("Howard Kennedy", 51, new Premiu[]{});

        Film film1 = new Film(2007, "film cu actori de oscar", new Actor[]{stuartReid,basilGray});
        Film film2 = new Film(2019, "film cu actori de oscar", new Actor[]{stuartReid, britneyMoore});
        Film film3 = new Film(1989, "film fara premii1", new Actor[]{howardKennedy});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film3});
        Studio studio2 = new Studio("Disney", new Film[]{film2});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        return studioDatabase;
    }
    public static void printAllStudioNamesWithMoreThan1Movie(){
        for(Studio studio : getData()){
            if (studio.filme.length > 1)
                System.out.println("Studio care a produs mai mult de 1 film"
                        +studio.nume);
        }
    }

    public static void printStudioNamesWithActorWith2Awards(){
        for (Studio studio : getData()){
            for (Film film : studio.filme){
                for (Actor actor : film.actori){
                    if (actor.premii.length == 2)
                        System.out.println("Studio cu actor cu mai mult de 2 premii: "
                                +studio.nume);
                }
            }
        }
    }

    public static void printMovieWithActorOlderThan50(){
        for (Studio studio : getData()) {
            for (Film film : studio.filme) {
                for (Actor actor : film.actori) {
                    if (actor.varsta >= 50)
                        System.out.println("Actor cu varsta de peste 50: "
                                + actor.nume);
                }
            }
        }
    }

    public static void main(String[] args) {
        printMovieWithActorOlderThan50();
        printStudioNamesWithActorWith2Awards();
        printAllStudioNamesWithMoreThan1Movie();
    }
}
