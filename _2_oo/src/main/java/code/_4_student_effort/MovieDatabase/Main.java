package code._4_student_effort.MovieDatabase;

public class Main {
    public static Studio[] Info(){
        Premiu oscar1990 = new Premiu("oscar",1990);
        Premiu oscar2000 = new Premiu("oscar",2000);
        Premiu oscar2010 = new Premiu("oscar",2010);
        Premiu oscar2018 = new Premiu("oscar",2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri",35,new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000",55,new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018",23,new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01",33,new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02",60,new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03",20,new Premiu[]{});

        Film film1 = new Film(1990,"film cu actori de oscar",new Actor[]{actorOscar1990,actorFaraPremii01});
        Film film2 = new Film(2010,"film cu actori fara premii2",new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film3 = new Film(2010,"film cu actori fara premii3",new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
        Film film4 = new Film(2018,"film cu actori de oscar",new Actor[]{actorOscar2010,actorOscar2018,actorFaraPremii02});
        Film film5 = new Film(2018,"film cu actori fara premii5",new Actor[]{actorFaraPremii02,actorFaraPremii03});

        Studio studio1 = new Studio("MGM",new Film[]{film1,film2});
        Studio studio2 = new Studio("Disney",new Film[]{film3,film4,film5});

        Studio[] studioDatabase = new Studio[]{studio1,studio2};

        return  studioDatabase;
    }

    public static void GetStudiosWithMoreThan2Movies(){
        System.out.println("The studios that have published more than 2 movies are:\n ");
        for(Studio studio : Info() ){
            if(studio.filme.length > 2){
                System.out.println(studio.nume);
            }
        }
    }

    public static void GetStudiosWithActorCu2Oscaruri(){
        System.out.println("The studios in which plays the actor with name actor cu 2 oscaruri are:\n");
        for(Studio studio : Info() ){
            for(Film film : studio.filme){
                for (Actor actor : film.actori){
                    if(actor.nume.equals("actor cu 2 oscaruri")){
                        System.out.println(studio.nume);
                    }
                }
            }
        }
    }

    public static void GetMoviesWithActorAgeAbove50(){
        System.out.println("The movies that have actors with the age above 50 are:\n");
        for(Studio studio : Info() ){
            for(Film film : studio.filme){
                for (Actor actor : film.actori){
                    if(actor.varsta > 50){
                        System.out.println(studio.nume);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        GetStudiosWithMoreThan2Movies();
        GetStudiosWithActorCu2Oscaruri();
        GetMoviesWithActorAgeAbove50();
    }
}
