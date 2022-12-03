package code._4_student_effort.challenge_2;

public class Film {
    private String nume;
    private Integer anApartie;
    private Actor[] actori;

    public Film(String nume, Integer anApartie, Actor[] actori) {
        this.nume = nume;
        this.anApartie = anApartie;
        this.actori = actori;
    }

    public String getNume() {
        return nume;
    }

    public Integer getAnApartie() {
        return anApartie;
    }

    public Actor[] getActori() {
        return actori;
    }
}
