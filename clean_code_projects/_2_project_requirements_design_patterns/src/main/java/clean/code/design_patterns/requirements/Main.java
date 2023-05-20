package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        Autobuz autobuz01 = new AutobuzBuilder()
                .setNumar_inmatriculare("B54STB")
                .setFirma("STB")
                .setOra_start_tura("8:30")
                .setNume_sofer("Dumbrava")
                .setPrenume_sofer("Sorin")
                .createAutobuz();

        Autobuz autobuz02 = new AutobuzBuilder()
                .setNumar_inmatriculare("B122SOGP")
                .setFirma("Omega Pro")
                .setOra_start_tura("9:45")
                .setNume_sofer("Sorescu")
                .setPrenume_sofer("Ionel")
                .createAutobuz();

        Autobuz autobuz03 = new AutobuzBuilder()
                .setNumar_inmatriculare("B324DDD")
                .setFirma("DDD")
                .setOra_start_tura("7:15")
                .setNume_sofer("Bica")
                .setPrenume_sofer("Marian")
                .createAutobuz();

        Autobuz autobuz04 = new AutobuzBuilder()
                .setNumar_inmatriculare("B11LKD")
                .setFirma("Lukadi")
                .setOra_start_tura("10:10")
                .setNume_sofer("Miron")
                .setPrenume_sofer("Nicu")
                .createAutobuz();

        Autobuz autobuz05 = new AutobuzBuilder()
                .setNumar_inmatriculare("B764MIR")
                .setFirma("MIR TRANSPORT")
                .setOra_start_tura("6:55")
                .setNume_sofer("Costea")
                .setPrenume_sofer("Marcel")
                .createAutobuz();

        Autobuz[] arr = new Autobuz[] {
                autobuz01,
                autobuz02,
                autobuz03,
                autobuz04,
                autobuz05
        };

        System.out.println();
        System.out.println("Sortarea autobuzelor dupa ora la care pleaca din statie:");
        System.out.println();

        System.out.println("Sortarea in functie de primul autobuz care pleaca din statie: ");
        System.out.println();
        TemplateMethodPattern.sort(arr, new SortAscendent());
        display(arr);

        System.out.println();
        System.out.println("Sortarea in functie de ultimul autobuz care pleaca din statie: ");
        System.out.println();
        TemplateMethodPattern.sort(arr, new SortDescendent());
        display(arr);

    }
    public static void display(Autobuz[] arr){
        for(Autobuz a:arr){
            System.out.println(a);
        }
    }
}
