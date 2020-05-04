package code._4_student_effort;
import java.util.ArrayList;
import java.util.Arrays;

public class Film {
    Integer anAparitie;
    String nume;
    Actor actori[];

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    boolean hasActor(String name) {
        for (Actor actor : actori) {
            if (actor.nume == name) {
                return true;
            }
        }
        return false;
    }

    ArrayList<Actor> getOldActors() {
        ArrayList<Actor> oldActors = new ArrayList<>();
        for (Actor actor : actori) {
            if (actor.above50()) {
                oldActors.add(actor);
            }
        }
        return oldActors;
    }

    boolean hasOldActors() {
        for (Actor actor : actori) {
            if (actor.above50()) {
                return true;
            }
        }
        return false;
    }



}

