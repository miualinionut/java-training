package clean.code.design_patterns.requirements;

import java.time.LocalTime;

public class Autobuz{
    private String firma;
    private LocalTime ora_start_tura;
    private String nume_sofer;
    private String prenume_sofer;
    private String numar_inmatriculare;

    public Autobuz(String firma, LocalTime ora_start_tura, String nume_sofer, String prenume_sofer, String numar_inmatriculare) {
        this.firma = firma;
        this.ora_start_tura = ora_start_tura;
        this.nume_sofer = nume_sofer;
        this.prenume_sofer = prenume_sofer;
        this.numar_inmatriculare = numar_inmatriculare;
    }

    public String getFirma() {
        return firma;
    }

    public LocalTime getOra_start_tura() {
        return ora_start_tura;
    }

    public String getNume_sofer() {
        return nume_sofer;
    }

    public String getPrenume_sofer() {
        return prenume_sofer;
    }

    public String getNumar_inmatriculare() {
        return numar_inmatriculare;
    }

    @Override
    public String toString() {
        return "Autobuz {" + "Numar de inmatriculare = '" + numar_inmatriculare + '\'' +
                ", Companie = '" + firma + '\'' +
                ", Ora plecare = " + ora_start_tura +
                ", Numele soferului = '" + nume_sofer + '\'' +
                ", Prenumele soferului = '" + prenume_sofer + '\'' +
                '}';
    }
}

