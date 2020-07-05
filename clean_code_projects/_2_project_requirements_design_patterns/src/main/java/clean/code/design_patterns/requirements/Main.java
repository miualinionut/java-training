package clean.code.design_patterns.requirements;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package
        Scanner scanner = new Scanner(System.in);
        String comanda = null;
        String numeClient = null;
        String produsComandat = null;
        String[] result = null;

        while (true) {
            comanda = scanner.nextLine();

            if (comanda.equalsIgnoreCase("EXIT")) {
                break;

            }  else if (comanda.contains("ADAUGA_CLIENT")) {
                result = comanda.split("\\s+");
                Starbucks.getInstanceStarbucks().adaugaClient(result[1]);

            } else if (comanda.contains("ADAUGA_PRODUS")) {
                result = comanda.split("\\s+");
                numeClient = result[1];
                produsComandat = result[2];
                Starbucks.getInstanceStarbucks().adaugaProdus(numeClient, produsComandat);

            }  else if (comanda.contains("AFISARE_COS")) {
                result = comanda.split("\\s+");
                numeClient = result[1];
                Starbucks.getInstanceStarbucks().afisareCos(numeClient);
            }
        }
    }
}
