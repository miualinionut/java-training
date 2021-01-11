package clean.code.design_patterns.requirements;

public class Main {
    public static void main(String[] args) {
        Bar pub = new Bar();

        Client client1 = new Client(1, 578.9);
        pub.addNewCommand(client1, DrinkFactory.getDrinkType("Irish"));
        pub.addNewCommand(client1, DrinkFactory.getDrinkType("Bubble_Tea"));
        pub.addNewCommand(client1, DrinkFactory.getDrinkType("Iced_Latte"));
        pub.clientBuys(client1);

        Client client2 = new Client(2, 25.99);
        Client client3 = new Client(3, 129.34);
        Client client4 = new Client(4, 70.0);

        pub.addNewCommand(client2, DrinkFactory.getDrinkType("Strawberry_Smoothie"));
        pub.addNewCommand(client2, DrinkFactory.getDrinkType("Lemon_Tea"));
        pub.addNewCommand(client2, DrinkFactory.getDrinkType("Cappuccino"));
        pub.addNewCommand(client3, DrinkFactory.getDrinkType("Black_Tea"));
        pub.addNewCommand(client3, DrinkFactory.getDrinkType("Green_Smoothie"));
        pub.addNewCommand(client3, DrinkFactory.getDrinkType("Black_Tea"));
        pub.addNewCommand(client4, DrinkFactory.getDrinkType("Iced_Latte"));
        pub.addNewCommand(client4, DrinkFactory.getDrinkType("Espresso"));

        pub.clientBuys(client2);
        pub.clientBuys(client3);
        pub.clientBuys(client4);
    }
}
