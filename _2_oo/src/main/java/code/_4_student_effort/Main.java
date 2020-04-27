package code._4_student_effort;

import code._4_student_effort.BoxingMatch;
import code._4_student_effort.Challenge_2.Actor;
import code._4_student_effort.Challenge_2.Film;
import code._4_student_effort.Challenge_2.Premiu;
import code._4_student_effort.Challenge_2.Studio;
import code._4_student_effort.Challenge_3.*;
import code._4_student_effort.Fighter;

public class Main {

    public static void main(String[] args) {
        // Challenge 1
        Fighter fighter1 = new Fighter("Mike Tyson", 100, 15);
        Fighter fighter2 = new Fighter("Floyd Mayweather", 85, 20);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);

        System.out.println("The winner is: " + boxingMatch.Fight());
        System.out.println();

        // Challenge 2
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

        StudioWithMoreThan2Movies(studioDatabase);
        StudioWithActorWith2Oscars(studioDatabase);
        MovieWithActorAbove50(studioDatabase);
        System.out.println();

        // Challenge 3
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.play();
        d.walk();

        c.eat();
        c.play();
        c.walk();

        a.eat();
        a.walk();

        e.walk();
        e.eat();

        ((Cat) p).eat();
        c.eat();
    }

    public static void StudioWithMoreThan2Movies(Studio[] studioDatabase) {
        for (Studio studio : studioDatabase) {
            if (studio.getFilme().length > 2) {
                System.out.println(studio.getNume());
            }
        }
    }

    public static void StudioWithActorWith2Oscars(Studio[] studioDatabase) {
        for (Studio studio : studioDatabase) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getNume().contains("actor cu 2 oscaruri")) {
                        System.out.println(studio.getNume());
                    }
                }
            }
        }
    }

    public static void MovieWithActorAbove50(Studio[] studioDatabase) {
        for (Studio studio : studioDatabase) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getVarsta() > 50) {
                        System.out.println(film.getNume());
                    }
                }
            }
        }
    }
}
