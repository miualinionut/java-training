package code._4_student_effort;

public class Film{
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;



    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }

    public void movieName(){
        for (int i = 0; i < this.actori.length; i++){
            if (this.getActori()[i].getVarsta() > 50){
                System.out.println(this.nume);
                break;
            }
        }
    }
}
