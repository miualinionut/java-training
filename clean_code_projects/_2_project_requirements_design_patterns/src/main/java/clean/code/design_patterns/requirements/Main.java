package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        Client1 client1 = new Client1();
        Client2 client2 = new Client2();
        Client3 client3 = new Client3();
        String salataTrue = " cu salata";
        String salataFalse = " fara salata";
        String sosFalse = " fara sos";
        long i = 5000000000L;


        System.out.println("Buna ziua, bine v-am gasit la fabrica mea de burgeri digitali");
        System.out.println("Se pare ca avem azi 3 clienti, sa auzim ce vrea fiecare");

        System.out.print("Primul client doreste : " + client1.typeOfMeat());
        if(client1.salad() == true) System.out.print(salataTrue);
        else System.out.print(salataFalse);
        if(client1.sauce() == true) System.out.print(" si cu " + client1.typeOfSauce());
        else System.out.print(sosFalse);
        System.out.println();
        System.out.print("Burgerul se pregateste ");
        while(i >0 ){
            if ( i % 1000000000L == 0) System.out.print(". ");
            i--;
        }
        System.out.println("");
        BurgerFactory burger = new BurgerFactory.BuilderBurgerFactory(client1.typeOfMeat()).setSalad(client1.salad()).setSauce(client1.sauce(),client1.typeOfSauce()).build();
        System.out.println("Burgerul s-a pregatit, pofta buna!");
    }
}
