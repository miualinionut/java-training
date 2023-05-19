package code._3_in_class.builder;

public class StudentBuilder {

    public StudentBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public StudentBuilder setPrenume(String prenume) {
        this.prenume = prenume;
        return this;
    }

    public StudentBuilder setVarsta(int varsta) {
        this.varsta = varsta;
        return this;
    }

    public StudentBuilder setFacultate(String facultate) {
        this.facultate = facultate;
        return this;
    }

    public StudentBuilder setMedieAnuala(double medieAnuala) {
        this.medieAnuala = medieAnuala;
        return this;
    }

    public StudentBuilder setRestaurantPreferat(String restaurantPreferat) {
        this.restaurantPreferat = restaurantPreferat;
        return this;
    }

    public StudentBuilder setCuloarePreferata(String culoarePreferata) {
        this.culoarePreferata = culoarePreferata;
        return this;
    }

    public StudentBuilder setInaltime(double inaltime) {
        this.inaltime = inaltime;
        return this;
    }

    public StudentBuilder setGreutate(double greutate) {
        this.greutate = greutate;
        return this;
    }

    public StudentBuilder setMarimePantof(int marimePantof) {
        this.marimePantof = marimePantof;
        return this;
    }

    public StudentBuilder setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
        return this;
    }

    public StudentBuilder setAdresa(String adresa) {
        this.adresa = adresa;
        return this;
    }

    public StudentBuilder setAdresaFacultate(String adresaFacultate) {
        this.adresaFacultate = adresaFacultate;
        return this;
    }

    public StudentBuilder setNumeTata(String numeTata) {
        this.numeTata = numeTata;
        return this;
    }

    public StudentBuilder setPrenumeTata(String prenumeTata) {
        this.prenumeTata = prenumeTata;
        return this;
    }

    public StudentBuilder setNumeMama(String numeMama) {
        this.numeMama = numeMama;
        return this;
    }

    public StudentBuilder setPrenumeMama(String prenumeMama) {
        this.prenumeMama = prenumeMama;
        return this;
    }

    public StudentBuilder setNumeSora01(String numeSora01) {
        this.numeSora01 = numeSora01;
        return this;
    }

    public StudentBuilder setPrenumeSora01(String prenumeSora01) {
        this.prenumeSora01 = prenumeSora01;
        return this;
    }

    public StudentBuilder setNumeSora02(String numeSora02) {
        this.numeSora02 = numeSora02;
        return this;
    }

    public StudentBuilder setPrenumeSora02(String prenumeSora02) {
        this.prenumeSora02 = prenumeSora02;
        return this;
    }

    private String nume;
    private String prenume;
    private int varsta;
    private String facultate;
    private double medieAnuala;
    private String restaurantPreferat;
    private String culoarePreferata;
    private double inaltime;
    private double greutate;
    private int marimePantof;
    private String nrTelefon;
    private String adresa;
    private String adresaFacultate;
    private String numeTata;
    private String prenumeTata;
    private String numeMama;
    private String prenumeMama;
    private String numeSora01;
    private String prenumeSora01;
    private String numeSora02;
    private String prenumeSora02;

    public StudentBuilder(String nume, String facultate)
    {
        this.nume=nume;
        this.facultate=facultate;
    }

    public Student build() {
        return new Student(nume, facultate);
    }
}
