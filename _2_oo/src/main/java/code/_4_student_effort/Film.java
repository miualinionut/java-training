package code._4_student_effort;

public class Film {

    public Integer anAparitie;
    public String nume;
    public Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Actor getActor(String actorName){
        for(Actor actor: actori){
            if (actor.nume.equals(actorName))
                return actor;
        }
        return null;
    }

   public Film getFilm (Integer age){
        for(Actor actor: actori){
            if(actor.varsta > age)
                return this;
        }
        return null;
   }
}
