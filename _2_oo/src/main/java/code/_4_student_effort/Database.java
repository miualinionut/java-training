package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Database {

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018 );

        Actor actorOscar1990 = new Actor("actor 2 oscaruri", 35, new Premiu[] {oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor oscar 2010", 55, new Premiu[] {oscar2010});
        Actor actorOscar2018 = new Actor("actor oscar 2018", 23, new Premiu[] {oscar2018});
        Actor actorfp01 = new Actor("actor fara oscar 01", 33, new Premiu[] {});
        Actor actorfp02 = new Actor("actor fara oscar 02", 60, new Premiu[] {});
        Actor actorfp03 = new Actor("actor fara oscar 03", 20, new Premiu[] {});

        Film film1 = new Film(1990, "film actori oscar", new Actor[] {actorOscar1990, actorfp01});
        Film film2 = new Film(2010, "film actori fp2", new Actor[] {actorfp01, actorfp02, actorfp03});
        Film film3 = new Film(2010, "film actor fp3", new Actor[] {actorfp01, actorfp02, actorfp03});
        Film film4 = new Film(2018, "film actori oscar", new Actor[] {actorOscar2010, actorOscar2018, actorfp02});
        Film film5 = new Film(2018, "film actor fp5", new Actor[] {actorfp02, actorfp03});

        Studio studio1 = new Studio("MGM", new Film[] {film1, film2});
        Studio studio2 = new Studio("Disney", new Film[] {film3, film4, film5});

        Studio[] studioDatabase = new Studio[] {studio1, studio2};

        //query 1
        int query1    = 0;
        int threshold = 2;

        for(int i = 0; i < studioDatabase.length; i++)
            if(studioDatabase[i].filme.length >= threshold)
                query1++;

        System.out.println(query1);

        //query 2
        List<String> studio = new ArrayList<>();
        String actor = "actor 2 oscaruri";

        for(int i = 0; i < studioDatabase.length; i++)
            for(int j = 0; j < studioDatabase[i].filme.length; j++)
                for(int k = 0; k < studioDatabase[i].filme[j].actori.length; k++)
                    if(studioDatabase[i].filme[j].actori[k].nume == actor)
                        studio.add(studioDatabase[i].nume);

        System.out.println(studio);

        //query 3
        List<String> filme = new ArrayList<>();
        int varsta = 50;

        for(int i = 0; i < studioDatabase.length; i++)
            for(int j = 0; j < studioDatabase[i].filme.length; j++)
                for(int k = 0; k < studioDatabase[i].filme[j].actori.length; k++)
                    if(studioDatabase[i].filme[j].actori[k].varsta > varsta)
                        filme.add(studioDatabase[i].filme[j].nume);

        System.out.println(filme);
    }
}

class Premiu {
    public String nume;
    public int an;

    public Premiu(String nume, int an) {
        this.nume = nume;
        this.an   = an;
    }
}

class Actor {
    public String nume;
    public int varsta;
    public Premiu[] premii;

    public Actor(String nume, int varsta, Premiu[] premii) {
        this.nume    = nume;
        this.varsta  = varsta;
        this .premii = premii;
    }
}

class Film {
    public int anAparitie;
    public String nume;
    public Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume       = nume;
        this.actori     = actori;
    }
}

class Studio {
    public String nume;
    public Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume  = nume;
        this.filme = filme;
    }
}   