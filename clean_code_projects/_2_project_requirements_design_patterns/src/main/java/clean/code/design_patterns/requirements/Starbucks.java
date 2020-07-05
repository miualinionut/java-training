package clean.code.design_patterns.requirements;

import java.util.Scanner;
import java.util.TreeMap;

public class Starbucks {
    private static Starbucks instance;
    private TreeMap<String, CosCumparaturi> numeCuCos;
    private Scanner scanner;
    private String[] result;
    private String comanda;

    private Starbucks() {
        numeCuCos = new TreeMap<>();
        scanner = new Scanner(System.in);
    }

    public static Starbucks getInstanceStarbucks() {
        if (instance == null)
            instance = new Starbucks();

        return instance;
    }

    public void adaugaClient(String numeClient) {
        if (numeClient != null && !numeClient.isEmpty()) {
            numeCuCos.put(numeClient, new CosCumparaturi());
            System.out.println("Client " + numeClient + " a fost adaugat cu succes!");
        }
    }
    public void adaugaProdus(String numeClient, String produsComandat) {

        if (numeClient != null && !numeClient.isEmpty()) {
            CosCumparaturi cos = numeCuCos.get(numeClient);
            if (cos != null) {

                Cafea cafea = null;
                if (produsComandat.equalsIgnoreCase("cafeaNeagra")){
                    cafea = new CafeaNeagra();
                } else {
                    cafea = new CafeaAmericano();
                }
                System.out.println(cafea.getDescriere() + " " + cafea.getCost());
                cos.adaugaProdusDeCumparat(cafea);
                System.out.println("Client " + numeClient + " a adaugat cu succes cafea!");

                result =  null;
                comanda =  null;
                System.out.println("Ingrediente preferate?");

                comanda = scanner.nextLine();
                result = comanda.split("\\s+");

                if (result[0].equalsIgnoreCase("nu")) {
                    System.out.println("O zi buna!");
                } else {

                    Lapte lapte = new Lapte(cafea);
                    System.out.println(lapte.getDescriere() + "" + lapte.getCost());

                    Zahar zahar = new Zahar(lapte);
                    System.out.println(zahar.getDescriere() + "" + zahar.getCost());

                }
            }
        }
    }

    public void afisareCos(String numeClient) {

        if (numeClient != null && !numeClient.isEmpty()) {
            CosCumparaturi cos = numeCuCos.get(numeClient);
            if (cos != null) {
                System.out.println("Clientul " + numeClient + " are " + cos.toString());
            }
        }
    }


}
