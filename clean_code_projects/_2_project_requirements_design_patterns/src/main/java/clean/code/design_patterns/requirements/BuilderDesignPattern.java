package clean.code.design_patterns.requirements;

public class BuilderDesignPattern {

    public static void main(String[] args) {
    Autobuz autobuz = new AutobuzBuilder()
            .setNumar_inmatriculare("B54STB")
            .setFirma("STB")
            .setOra_start_tura("8:30")
            .setNume_sofer("Dumbrava")
            .setPrenume_sofer("Sorin")
            .createAutobuz();
        System.out.println(autobuz);
    }
}
