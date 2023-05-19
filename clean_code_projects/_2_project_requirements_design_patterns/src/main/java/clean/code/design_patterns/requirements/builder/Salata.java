// Definirea clasei Salata
public class Salata {
    private String salata;
    private String sos;
    private boolean branza;
    private boolean crutoane;


    private Salata(SalataBuilder builder) {
        this.salata = builder.salata;
        this.sos = builder.sos;
        this.branza = builder.branza;
        this.crutoane = builder.crutoane;
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
