package clean.code.design_patterns.requirements.CompositePattern;

public class AngajatMain {

    public static void main(String[] args) {
        Angajat angajatConducere1 = new Angajat("Andrei","Conducere");

        Angajat angajatHead1 = new Angajat("Alina","Head development");
        Angajat angajatHead2 = new Angajat("Cristi","Head vanzari");

        Angajat muncitor1 = new Angajat("Elena","developer");
        Angajat muncitor2 = new Angajat("Cornel","qa");

        angajatConducere1.adaugaSubsubordonat(angajatHead1);
        angajatConducere1.adaugaSubsubordonat(angajatHead2);
        angajatHead1.adaugaSubsubordonat(muncitor1);
        angajatHead1.adaugaSubsubordonat(muncitor2);

        System.out.println(angajatConducere1);

        for (Angajat angajatHead:angajatConducere1.getSubordonat()
             ) {
            System.out.println(angajatHead);

            for (Angajat muncitor:angajatHead.getSubordonat()
            ) {
                System.out.println(muncitor);
            }
            }
        }

    }

