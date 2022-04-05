package code._3_in_class;

public class UtilizatorSmartphone {
    public String serialNumberTelefon; //confortabil sa partajam
    private int varsta; //confortabil sa partajam:

    // nu suntem confortabili sa partajam:
    private String adresaemail;
    private String nume;
    private String locatieGPS;
    private String listaProblemeDeSanatate;
    private String[] interese;
    private String[] siteuriWebVizitateInUltimaSaptamana;
    private String[] smsuriPrimiteSiTrimise;
    private String[] apeluriPrimiteSiTrimise;
    private String[] listaContacteTelefon;

    public String getSerialNumberTelefon() {
        return serialNumberTelefon;
    }

    public void setSerialNumberTelefon(String serialNumberTelefon) {
        this.serialNumberTelefon = serialNumberTelefon;
    }

    public String getVarsta() {
        if(varsta == 10) {
            return "zece ani";
        } else if(varsta == 11) {
            return "unsprezece ani";
        }
        return "nu stiu sa exprim in cuvinte";
    }

    public void setVarsta(int varsta)
    { if(varsta > 0 && varsta < 110) {
        this.varsta = varsta;
    } else {
        throw new IllegalArgumentException("valoare incorecta pentru parametrul varsta");
    }
}
}
