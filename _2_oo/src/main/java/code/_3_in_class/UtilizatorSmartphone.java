package code._3_in_class;

public class UtilizatorSmartphone {
    public String serialNumberTelefon;


    //nu suntem confortabili sa partajam
    private int age;
    private String adresaEmail;
    private String nume;
    private String locatieGPS;
    private String listaProblemeDeSanatate;
    private String [] interese;
    private String[] siteuriWebVizitateInUltimaSaptamana;
    private String [] smsuriPrimiteSiTrimise;
    private String[] apeluriPrimiteSiTrimise;
    private String[] listaContacteTelefon;

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public void setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }

    public String getSerialNumberTelefon() {
        return serialNumberTelefon;
    }

    public void setSerialNumberTelefon(String serialNumberTelefon) {
        this.serialNumberTelefon = serialNumberTelefon;
    }

    public String getAge() {
        if(age == 10){
            return "Zece ani";
        } else if (age == 11) {
            return "11 aani";
        }
        return "nu stiu sa exprim in cuvinte";
    }

    public void setAge(int a) throws IllegalAccessException {
        if(a >0 && a < 110){
            this.age = a;
        } else {
            throw new IllegalAccessException("Varsta incorecta pentru parametrul varsta");
        }

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatieGPS() {
        return locatieGPS;
    }

    public void setLocatieGPS(String locatieGPS) {
        this.locatieGPS = locatieGPS;
    }

    public String getListaProblemeDeSanatate() {
        return listaProblemeDeSanatate;
    }

    public void setListaProblemeDeSanatate(String listaProblemeDeSanatate) {
        this.listaProblemeDeSanatate = listaProblemeDeSanatate;
    }

    public String[] getInterese() {
        return interese;
    }

    public void setInterese(String[] interese) {
        this.interese = interese;
    }

    public String[] getSiteuriWebVizitateInUltimaSaptamana() {
        return siteuriWebVizitateInUltimaSaptamana;
    }

    public void setSiteuriWebVizitateInUltimaSaptamana(String[] siteuriWebVizitateInUltimaSaptamana) {
        this.siteuriWebVizitateInUltimaSaptamana = siteuriWebVizitateInUltimaSaptamana;
    }

    public String[] getSmsuriPrimiteSiTrimise() {
        return smsuriPrimiteSiTrimise;
    }

    public void setSmsuriPrimiteSiTrimise(String[] smsuriPrimiteSiTrimise) {
        this.smsuriPrimiteSiTrimise = smsuriPrimiteSiTrimise;
    }

    public String[] getApeluriPrimiteSiTrimise() {
        return apeluriPrimiteSiTrimise;
    }

    public void setApeluriPrimiteSiTrimise(String[] apeluriPrimiteSiTrimise) {
        this.apeluriPrimiteSiTrimise = apeluriPrimiteSiTrimise;
    }

    public String[] getListaContacteTelefon() {
        return listaContacteTelefon;
    }

    public void setListaContacteTelefon(String[] listaContacteTelefon) {
        this.listaContacteTelefon = listaContacteTelefon;
    }
}
