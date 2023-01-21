package clean.code.design_patterns.requirements.Factory;

public class testFactory {

    public static void main(String[] args) {
        Solar solar = new Solar();

        Leguma leguma1= solar.getLeguma("Rosie");
        leguma1.getLeguma();
        leguma1.getCantitate();
        leguma1.getPret();

        Leguma leguma2= solar.getLeguma("Cartof");
        leguma2.getLeguma();
        leguma2.getCantitate();
        leguma2.getPret();

    }


}

