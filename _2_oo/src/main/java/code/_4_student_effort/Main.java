package code._4_student_effort;

import code._4_student_effort.animal_hierarchy.*;
import code._4_student_effort.movies_database.Actor;
import code._4_student_effort.movies_database.Film;
import code._4_student_effort.movies_database.Premiu;
import code._4_student_effort.movies_database.Studio;
import code._4_student_effort.two_fighters.BoxingMatch;
import code._4_student_effort.two_fighters.Fighter;

public class Main {

    public static void main(String[] args) {
/*     Fighter f1=new Fighter("Fgt1", 100d, 5f);
    Fighter f2=new Fighter("Fgt2", 100d, 3f);
    BoxingMatch match=new BoxingMatch(f1,f2);
    System.out.println(match.fight());
*/

/*        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2000});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new  Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new  Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new
                Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new
                Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new
                Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new
                Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new
                Actor[]{actorFaraPremii02, actorFaraPremii03});
        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        for (Studio studio: studioDatabase) {
            if (studio.filme.length>2)
                System.out.println("Studio cu mai mult de 2 filme "+studio.nume);
        }

        for (Studio studio: studioDatabase) {
            boolean found = false;
            for (Film film : studio.filme){
                for (Actor actor : film.actori){
                    if (actor.nume.equals("actor cu 2 oscaruri")){
                        found=true;
                        System.out.println("Studio cu filme in care joaca actorul ala: "+ studio.nume);
                        break;
                    }
                }
                if (found)
                    break;
            }
        }

        for (Studio studio: studioDatabase){
            for (Film film : studio.filme){
                for (Actor actor : film.actori){
                    if (actor.varsta>50){
                        System.out.println("film cu actori peste 50: "+ film.nume);
                        break;
                    }
                }
            }
        }*/

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println(c.getName());
        c.setName("nume2");
        System.out.println(c.getName());

        ((Fish) a).walk();
        p.setName("nume3");
        System.out.println(p.getName());
    }
}