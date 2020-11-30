package code._4_student_effort._movieDatabase;

public class Film {
    private int AnAparitie;
    private String Nume;
    private Actor [] Actori;

    public Film(int anAparitie, String nume, Actor [] actori) {
        AnAparitie = anAparitie;
        Nume = nume;
        Actori = actori;
    }

    public String getNume() {
        return Nume;
    }

    public Actor[] getActori() {
        return Actori;
    }
}
