package clean.code.design_patterns.requirements.builder;
public class SalataBuilder {
    private String salata;
    private String sos;
    private boolean branza;
    private boolean crutoane;

    public SalataBuilder salata(String salata) {
        this.salata = salata;
        return this;
    }

    public SalataBuilder sos(String sos) {
        this.sos = sos;
        return this;
    }

    public SalataBuilder branza(boolean branza) {
        this.branza = branza;
        return this;
    }

    public SalataBuilder crutoane(boolean crutoane) {
        this.crutoane = crutoane;
        return this;
    }

    public Salata build() {
        return new Salata(salata, sos, branza, crutoane);
    }
}
