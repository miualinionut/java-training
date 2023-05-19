public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect Salata utilizând SalataBuilder
        Salata salata = new Salata.SalataBuilder()
                .salata("Mix de salată verde")
                .sos("Iaurt")
                .branza(true)
                .crutoane(true)
                .build();

        // Accesarea atributelor obiectului Salata
        System.out.println("Salată: " + salata.getSalata());
        System.out.println("Sos: " + salata.getSos());
        System.out.println("Branză: " + salata.areBranza());
        System.out.println("Crutoane: " + salata.areCrutoane());
    }
}
