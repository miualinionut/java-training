package code._3_in_class;

public class UtilizatorSmartphone {
    private String serialNumberTelefon; //confortabil sa partajam
    private int age; //confortabil sa partajam

    //nu suntem confortabili sa partajam:
    private String adresaEmail;
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

    public String getAge() {
        if(age == 10) {
            return "zece ani";
        } else if(age == 11){
            return "unsprezece ani";
        }
        return "nici nu stiu sa ma exprim";
    }

    public void setAge(int age) {
        if(age > 0 && age < 110){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Valoare incorecta pentru parametrul varsta");
        }
    }
}
