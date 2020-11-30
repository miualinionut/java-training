package code._4_student_effort._movieDatabase;

import java.net.FileNameMap;

public class DataBase {
    public String NamesStudioMore2Movies(Studio [] studios) {
        String name = "";
        for(int i = 0; i < studios.length; i++) {
            if(studios[i].GetNumberOfFilms() > 2)
                name += studios[i].getNume() + ", ";
        }
        name = "Studio with more than 2 movies published: " + name;

        return name;
    }

    public String NamesStudioActor2Oscars(Studio [] studios) {
        String name = "";
        for(int i = 0; i < studios.length; i++) {
            Film[] filme =  studios[i].getFilme();
            for(int j = 0; j < filme.length; j++) {
                Actor[] actori = filme[j].getActori();
                for(int k = 0; k < actori.length; k++) {
                    if (actori[k].getNume() == "actor cu 2 oscaruri")
                        name += studios[i].getNume() + ", ";
                }
            }
        }
        name = "Studio in witch plays actor cu 2 oscaruri: "  + name;

        return name;
    }

    public String MovieNamesActors(Film [] filme) {
        String name = "";

        for(int i = 0; i < filme.length; i++) {
            Actor[] actori = filme[i].getActori();
            for (int j = 0; j < actori.length; j++) {
                if (actori[j].getVarsta() > 50) {
                    name += filme[i].getNume() + ", ";
                    break;
                }
            }
        }
        name = "Movie name in witch plays at least an actor with age above 50: "  + name;

        return name;
    }


}
