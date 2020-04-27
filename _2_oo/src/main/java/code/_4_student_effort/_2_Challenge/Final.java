package code._4_student_effort._2_Challenge;

import javax.print.attribute.standard.PresentationDirection;
import javax.tools.ForwardingJavaFileManager;

public class Final {
    static void getNameOfStudio(Studio[] database){
        for(int i = 0; i < database.length; i++){
            if(database[i].getFilme().length > 2)
                System.out.println(database[i].getNume());
        }
    };

    static void getActorFromStudio(Studio[] database){
        for(int i = 0; i  < database.length; i++){
            for(int j = 0; j < database[i].getFilme().length; j++){
                for(int k = 0; k < database[i].getFilme()[j].getActori().length; k++){
                    if(database[i].getFilme()[j].getActori()[k].getNume().compareTo("actor cu 2 oscaruri") == 0){
                        System.out.println(database[i].getNume());
                    }
                }
            }
        }
    }

    static void getActorAgeFromMovie(Film[] filme){
        for(int i = 0; i  < filme.length; i++){
            for(int j = 0; j < filme[i].getActori().length; j++){
                if(filme[i].getActori()[j].getVarsta() > 50)
                    System.out.println(filme[i].getNume());
            }
        }
    }

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraOscar1 = new Actor("sarac1", 33, new Premiu[]{});
        Actor actorFaraOscar2 = new Actor("sarac2", 60, new Premiu[]{});
        Actor actorFaraOscar3 = new Actor("sarac3", 20, new Premiu[]{});
        Actor[] actori = new Actor[]{actorOscar1990, actorOscar2010, actorOscar2018, actorFaraOscar1, actorFaraOscar2, actorFaraOscar3};

        Film film1 = new Film(1990, "film cu actori de oscar",
                new Actor[]{actorOscar1990, actorFaraOscar1});
        Film film2 = new Film(2010, "film cu act fara premii1",
                new Actor[]{actorFaraOscar1,actorFaraOscar2,actorFaraOscar3});
        Film film3 = new Film(2010, "film cu act fara premii2",
                new Actor[]{actorFaraOscar1,actorFaraOscar2,actorFaraOscar3});
        Film film4 = new Film(2018, "film cu act de oscar",
                new Actor[]{actorOscar2010,actorOscar2018,actorFaraOscar3});
        Film film5 = new Film(2018, "film cu act fara premii3",
                new Actor[]{actorFaraOscar2,actorFaraOscar3});
        Film[] filme = new Film[]{film1, film2, film3, film4, film5};

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        getNameOfStudio(studioDatabase);
        getActorFromStudio(studioDatabase);
        getActorAgeFromMovie(filme);

    }
}
