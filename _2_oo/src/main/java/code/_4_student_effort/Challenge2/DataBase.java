package code._4_student_effort.Challenge2;

public class DataBase {
    public static void main(String[] args) {
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

        System.out.println("Get all studio names with more than 2 films");
        for (int i = 0; i < studioDataBase.length; i++) {
            if (studioDataBase[i].filme.length > 2) {
                String numeFilm;
                numeFilm = studioDataBase[i].nume;
                System.out.println(numeFilm);
            }
        }

        System.out.println("\nGet the studio names where actor: actor cu 2 oscaruri; is playing");
        for (int i = 0; i < studioDataBase.length; i++) {
            for (int j = 0; j < studioDataBase[i].filme.length; j++) {
                for (int k = 0; k < studioDataBase[i].filme[j].actori.length; k++) {
                    if (studioDataBase[i].filme[j].actori[k].nume == "Actor2Oscaruri") {
                        System.out.println("Actor " + studioDataBase[i].filme[j].actori[k].nume + " is playing in: " + studioDataBase[i].nume + " studio.");
                    }
                }
            }

        }
        System.out.println("\nGet movie names in witch plays at least an actor with age above 50");
        for (int i = 0; i < studioDataBase.length; i++) {
            for (int j = 0; j < studioDataBase[i].filme.length; j++) {
                for (int k = 0; k < studioDataBase[i].filme[j].actori.length; k++) {
                     if(studioDataBase[i].filme[j].actori[k].varsta > 50){
                         System.out.println(studioDataBase[i].filme[j].nume);
                     }
                }
            }
        }


    }
}
