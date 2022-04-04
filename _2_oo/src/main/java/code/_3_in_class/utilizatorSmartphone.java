package code._3_in_class;

public class utilizatorSmartphone {

    private String uniqueGeneratedUserId; //de partajat
    private int varsta; //de partajat

    //nu suntem confortabili sa partajam
    private String locatieGPS;
    private String adresaEmail;
    private String nume;
    private String listaPbSanatate;
    private String[] interese;
    private String[] siteUltimaSapt;
    private String[] smsuriPrimiteSiTrimise;
    private String[] apeluriPrimiteSiTrimise;
    private String[] listaContacte;

    public String getUniqueGeneratedUserId() {
        return uniqueGeneratedUserId;
    }

    public String getVarsta() {
        return String.valueOf(varsta);
    }

    public void setUniqueGeneratedUserId(String uniqueGeneratedUserId) {
        this.uniqueGeneratedUserId = uniqueGeneratedUserId;
    }

    public void setVarsta(int varsta) {
        if(varsta > 0 && varsta < 110)
            this.varsta = varsta;
        else
            throw new IllegalArgumentException("Valoare incorecta pentru param. varsta");
    }

}
