package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        //am ales singleton pattern pentru a simula relatia intre
        //angajatii unei companii

        //mai exact, exista un singur CEO, motiv pentru care nu
        //exista mai multe instante ale clasei
        EagerInit CEO = EagerInit.getInstance();
        System.out.println("CEO's name is " +  CEO.name);

        //cand vine vorba de angajati, acestia pot avea mai multe pozitii
        //de aceea e mai usor sa instantiem obiectele cu factory pattern
        //in functie de pozitia ocupata de ei in firma

        Worker angajat1 = Firma.getWorker("Developer");
        Worker angajat2 = Firma.getWorker("Tester");

        System.out.println("Primul angajat este " + angajat1.getPosition() + " si are salariu " + angajat1.getSalary());
        System.out.println("Al doilea angajat este " + angajat2.getPosition() + " si are salariu " + angajat2.getSalary());
    }

}
