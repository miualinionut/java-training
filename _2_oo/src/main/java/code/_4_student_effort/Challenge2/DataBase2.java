package code._4_student_effort.Challenge2;

public class DataBase2 {
    public static void main(String[] args){
        System.out.println("Get all studio names with more than 2 films");
        Task1();
        System.out.println("\nGet the studio names where actor: actor cu 2 oscaruri; is playing");
        Task2();
        System.out.println("\nGet movie names in witch plays at least an actor with age above 50");
        Task3();
    }

    public static Studio[] getData(){
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor Actor1 = new Actor("Actor2Oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor Actor2 = new Actor("ActorOscar2010", 55, new Premiu[]{oscar2010});
        Actor Actor3 = new Actor("ActorOscar2018", 23, new Premiu[]{oscar2018});
        Actor ActorFaraPremii1 = new Actor("ActorFaraOscar01", 33, new Premiu[]{});
        Actor ActorFaraPremii2 = new Actor("ActorFaraOscar02", 60, new Premiu[]{});
        Actor ActorFaraPremii3 = new Actor("ActorFaraOscar01", 20, new Premiu[]{});

        Film film1 = new Film(1990, "Film cu actori de oscar", new Actor[]{Actor1, ActorFaraPremii1});
        Film film2 = new Film(2010, "Film cu actori fara premii2", new Actor[]{ActorFaraPremii1, ActorFaraPremii3, ActorFaraPremii2});
        Film film3 = new Film(2010, "Film cu actori fara premii3", new Actor[]{ActorFaraPremii1, ActorFaraPremii3, ActorFaraPremii2});
        Film film4 = new Film(2018, "Film cu actori de oscar", new Actor[]{Actor2, Actor3, ActorFaraPremii2});
        Film film5 = new Film(2018, "Film cu actori fara premii5", new Actor[]{ActorFaraPremii2, ActorFaraPremii3});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDataBase = new Studio[]{studio1, studio2};
        return studioDataBase;
    }


    public static void Task1(){
        for(Studio studio: getData()){
            if(studio.filme.length > 2){
                System.out.println(studio.nume);
            }
        }
    }

    public static void Task2(){
        for(Studio studio: getData()){
            for(Film film: studio.filme){
                for(Actor actor: film.actori){
                    if(actor.nume == "Actor2Oscaruri"){
                        System.out.println(studio.nume);
                    }
                }

            }
        }
    }
    public static void Task3(){
        for(Studio studio: getData()){
            for(Film film: studio.filme){
                for(Actor actor: film.actori){
                    if(actor.varsta < 21){
                        System.out.println(film.nume);
                    }
                }
            }
        }
    }

}
