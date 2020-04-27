package code._4_student_effort.challenge2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {


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
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii 2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii 3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        //1 get all studio names that have published more that 2 movies

        LinkedList<String> studioMulteFilme = new LinkedList<String>();
        for (int i = 0; i < studioDatabase.length; i++) {
            if (studioDatabase[i].filme.length > 2) {
                studioMulteFilme.add(studioDatabase[i].nume);
                System.out.println(studioMulteFilme);
            }
        }

        //2 get the studio names in witch plays the actor with name "actor cu 2 oscaruri"
        //este in actorOscar1990 -> film 1 -> studio 1

        for (int i = 0; i < studioDatabase.length; i++) {
            Studio studioCurent = studioDatabase[i];
            for (int j = 0; j < studioCurent.filme.length; j++) {
                Film filmCurent = studioCurent.filme[j];
                for (int k = 0; k < filmCurent.actori.length; k++) {
                    if (filmCurent.actori[k].nume.equals("actor cu 2 oscaruri")) {
                        System.out.println(studioCurent.nume);
                    }
                }
            }
        }

        //3 get movie names in witch plays at least an actor with age above 50

        for (int i = 0; i < studioDatabase.length; i++) {
            Studio studioCurent = studioDatabase[i];
            for (int j = 0; j < studioCurent.filme.length; j++) {
                Film filmCurent = studioCurent.filme[j];
                for (int k = 0; k < filmCurent.actori.length; k++) {
                    if (filmCurent.actori[k].varsta > 50) {
                        System.out.println(filmCurent.nume);
                        break;
                    }
                }
            }
        }
    }
}
