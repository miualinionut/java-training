package code._4_student_effort._2_movie_database;

public class Film {
    Integer anAparitie;
    String nume;
    Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public String getNume() {
        return nume;
    }

    public boolean hasActorsOlderThan(int minimumAge){
        for(Actor actor:actori)
            if(actor.varsta > minimumAge)
                return true;
        return false;
    }
}
