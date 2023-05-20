package clean.code.design_patterns.requirements;

import java.util.Objects;

public class jucatorFotbal {
    private String nume;
    private String echipa;
    private int varsta;
    private int goluriMarcate;

    private int assisturi;

    private int meciuriJucate;

    private int numarTrofee;
    private int cartonaseRosii;

    public jucatorFotbal(String nume, String echipa, int varsta, int goluriMarcate, int assisturi, int meciuriJucate, int numarTrofee, int cartonaseRosii) {
        this.nume = nume;
        this.echipa = echipa;
        this.varsta = varsta;
        this.goluriMarcate = goluriMarcate;
        this.assisturi = assisturi;
        this.meciuriJucate = meciuriJucate;
        this.numarTrofee = numarTrofee;
        this.cartonaseRosii = cartonaseRosii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEchipa() {
        return echipa;
    }

    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getGoluriMarcate() {
        return goluriMarcate;
    }

    public void setGoluriMarcate(int goluriMarcate) {
        this.goluriMarcate = goluriMarcate;
    }

    public int getAssisturi() {
        return assisturi;
    }

    public void setAssisturi(int assisturi) {
        this.assisturi = assisturi;
    }

    public int getMeciuriJucate() {
        return meciuriJucate;
    }

    public void setMeciuriJucate(int meciuriJucate) {
        this.meciuriJucate = meciuriJucate;
    }

    public int getNumarTrofee() {
        return numarTrofee;
    }

    public void setNumarTrofee(int numarTrofee) {
        this.numarTrofee = numarTrofee;
    }

    public int getCartonaseRosii() {
        return cartonaseRosii;
    }

    public void setCartonaseRosii(int cartonaseRosii) {
        this.cartonaseRosii = cartonaseRosii;
    }

    @Override
    public String toString() {
        return "Jucator: " +
                "nume='" + nume + '\'' +
                ", echipa='" + echipa + '\'' +
                ", varsta=" + varsta +
                ", goluriMarcate=" + goluriMarcate +
                ", assisturi=" + assisturi +
                ", meciuriJucate=" + meciuriJucate +
                ", numarTrofee=" + numarTrofee +
                ", cartonaseRosii=" + cartonaseRosii+
                ", Rating=" + ratingJucator();

    }
    public float ratingJucator(){
        float r;
        r = (getGoluriMarcate() * 0.7f) + (getAssisturi() * 0.5f) + (getMeciuriJucate() * 0.2f) + (getNumarTrofee() * 5.f) - (getCartonaseRosii() * 2.f);
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        jucatorFotbal that = (jucatorFotbal) o;
        return varsta == that.varsta && goluriMarcate == that.goluriMarcate && assisturi == that.assisturi && meciuriJucate == that.meciuriJucate && numarTrofee == that.numarTrofee && cartonaseRosii == that.cartonaseRosii && Objects.equals(nume, that.nume) && Objects.equals(echipa, that.echipa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, echipa, varsta, goluriMarcate, assisturi, meciuriJucate, numarTrofee, cartonaseRosii);
    }
}
