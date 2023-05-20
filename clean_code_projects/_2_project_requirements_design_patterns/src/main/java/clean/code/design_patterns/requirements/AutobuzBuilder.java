package clean.code.design_patterns.requirements;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class AutobuzBuilder {
    private String firma;
    private LocalTime oraStartTura;
    private String numeSofer;
    private String prenumeSofer;
    private String numarInmatriculare;

    public AutobuzBuilder setFirma(String firma) {
        this.firma = firma;
        return this;
    }

    public AutobuzBuilder setOra_start_tura(String oraStartTura) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        this.oraStartTura = LocalTime.parse(oraStartTura, formatter);
        return this;
    }

    public AutobuzBuilder setNume_sofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setPrenume_sofer(String prenumeSofer) {
        this.prenumeSofer = prenumeSofer;
        return this;
    }

    public AutobuzBuilder setNumar_inmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
        return this;
    }

    public Autobuz createAutobuz() {
        return new Autobuz(firma, oraStartTura, numeSofer, prenumeSofer, numarInmatriculare);
    }
}