public class Film {
    Integer anAparitie;
    String nume;
    Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }
}

