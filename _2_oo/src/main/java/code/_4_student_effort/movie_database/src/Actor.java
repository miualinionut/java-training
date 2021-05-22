public class Actor {

    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor (String nume,Integer varsta, Premiu[] premii)
    {
        this.nume=nume;
        this.varsta=varsta;
        this.premii=premii;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }
}
