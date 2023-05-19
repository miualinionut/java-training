public class Main {
    public static void main(String[] args) {
        // Initializarea unui obiect AfisPublicitar
        Logo logo = new Logo("logo_original");
        AfisPublicitar afisOriginal = new AfisPublicitar("Acesta este un afiș publicitar", logo);

        try {
            // Clonarea obiectului de tip Logo
            Logo logoClonat = afisOriginal.getLogo().clone();
            logoClonat.setImagine("logo_clonat");

            // Crearea unui nou afis publicitar cu logo-ul clonat
            AfisPublicitar afisClonat = new AfisPublicitar("Acesta este un afiș publicitar clonat", logoClonat);

            // Afisarea informatiilor despre afisul original si cel clonat
            System.out.println("Afiș publicitar original:");
            System.out.println("Text: " + afisOriginal.getText());
            System.out.println("Logo: " + afisOriginal.getLogo().getImagine());

            System.out.println("\nAfiș publicitar clonat:");
            System.out.println("Text: " + afisClonat.getText());
            System.out.println("Logo: " + afisClonat.getLogo().getImagine());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
