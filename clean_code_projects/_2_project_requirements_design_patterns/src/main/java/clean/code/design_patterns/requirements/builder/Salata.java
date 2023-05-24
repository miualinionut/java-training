package clean.code.design_patterns.requirements.builder;
//builder
public class Salata {
    private String salata; // baza
    private String sos; // sos
    private boolean branza; // indicator pentru prezența brânzei
    private boolean crutoane; // indicator pentru prezența crutoanelor

    Salata(String salata, String sos, boolean branza, boolean crutoane) {
        this.salata = salata;
        this.sos = sos;
        this.branza = branza;
        this.crutoane = crutoane;
    }

    public String getSalata() {
        return salata;
    }

    public String getSos() {
        return sos;
    }

    public boolean areBranza() {
        return branza;
    }

    public boolean areCrutoane() {
        return crutoane;
    }
}
