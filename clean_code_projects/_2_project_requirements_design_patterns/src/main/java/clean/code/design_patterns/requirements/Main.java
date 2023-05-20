public class Main {
    public static void main(String[] args) {
        Client1 client1 = new Client1();
        Client2 client2 = new Client2();
        Client3 client3 = new Client3();
        Client4 client4 = new Client4();
        String lapteTrue = " cu lapte";
        String lapteFalse = " fara lapte";
        String aromaFalse = " fara aroma";


        System.out.println("Buna ziua, bine ati venit la CoffeeVerse");
        System.out.println("De abia am deschis si deja avem azi 3 clienti, sa aflam ce doresc!");

        System.out.print("Primul client doreste : " + client1.typeOfCup());
        if(client1.milk() == true) System.out.print(lapteTrue);
        else System.out.print(lapteFalse);
        if(client1.flavour() == true) System.out.print(" si cu " + client1.typeOfFlavour());
        else System.out.print(aromaFalse);
        System.out.println();
        System.out.print("Cafeaua se pregateste ");
        System.out.println("");
        CoffeeShop cafea1 = new CoffeeShop.BuilderCoffeeShop(client1.typeOfCup()).setMilk(client1.milk()).setFlavour(client1.flavour(),client1.typeOfFlavour()).build();
        System.out.println("Cafeaua este gata!");

        System.out.println("=============clientul urmator=============");

        System.out.print("Al doilea client doreste : " + client1.typeOfCup());
        if(client2.milk() == true) System.out.print(lapteTrue);
        else System.out.print(lapteFalse);
        if(client2.flavour() == true) System.out.print(" si cu " + client2.typeOfFlavour());
        else System.out.print(aromaFalse);
        System.out.println();
        System.out.print("Cafeaua se pregateste ");
        System.out.println("");
        CoffeeShop cafea2 = new CoffeeShop.BuilderCoffeeShop(client2.typeOfCup()).setMilk(client2.milk()).setFlavour(client2.flavour(),client2.typeOfFlavour()).build();
        System.out.println("Cafeaua este gata!");

        System.out.println("=============clientul urmator=============");

        System.out.print("Al treilea client doreste : " + client1.typeOfCup());
        if(client4.milk() == true) System.out.print(lapteTrue);
        else System.out.print(lapteFalse);
        if(client4.flavour() == true) System.out.print(" si cu " + client2.typeOfFlavour());
        else System.out.print(aromaFalse);
        System.out.println();
        System.out.print("Cafeaua se pregateste ");
        System.out.println("");
        CoffeeShop cafea3 = new CoffeeShop.BuilderCoffeeShop(client4.typeOfCup()).setMilk(client4.milk()).setFlavour(client4.flavour(),client4.typeOfFlavour()).build();
        System.out.println("Cafeaua este gata!");

        System.out.println("=============... the sky is the limit ...=============");
    }
}