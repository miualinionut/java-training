

public class Main {
    public static void main(String[] args) {
        builderDesignPattern dateLivrare1 = new builderDesignPattern.Builder()
                .nrStrada("70")
                .strada("Iuliu Maniut")
                .oras("Ploiesti")
                .judet("Prahova")
                .codPostal("107110")
                .nrTelefon("0733445566")
                .build();

        builderDesignPattern dateLivrare2 = new builderDesignPattern.Builder()
                .nrStrada("123")
                .strada("Splaiul Independentei")
                .oras("Bucuresti")
                .judet("Bucuresti")
                .codPostal("100100")
                .nrTelefon("0790909029")
                .build();
        builderDesignPattern dateLivrare3 = new builderDesignPattern.Builder()
                .nrStrada("65")
                .strada("Cantacuzino")
                .oras("Iasi")
                .judet("Iasi")
                .codPostal("120304")
                .nrTelefon(null)
                .build();

        System.out.println(dateLivrare1);
        System.out.println(dateLivrare2);
        if(dateLivrare3.getNrTelefon() == null) {
            System.out.println();
            System.out.println(dateLivrare3);
            System.out.println("Lipseste numarul de telefon din datele de livrare.");
        }
    }
}