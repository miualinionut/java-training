package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bar {
    Map<Client, List<Drink>> commands;

    public Bar() {
        commands = new HashMap<>();
    }

    public void addNewCommand(Client client, Drink drink) {
        if (!commands.containsKey(client)) {
            commands.putIfAbsent(client, new ArrayList<>());
        }
        commands.get(client).add(drink);
    }

    public double getBill(List<Drink> drinks) {
        double bill = 0;
        for (Drink drink : drinks) {
            bill += drink.getPrice();
        }

        return bill;
    }

    public void displayCommand(Client client, double bill) {
        System.out.println("**********************");
        System.out.println("The client " + client.getId() + " bought:");
        for (Drink drink : commands.get(client)) {
            System.out.println("Drink: " + drink.getName() + ", Price: " + drink.getPrice() + " Ron");
        }
        System.out.println("BILL: " + bill + " Ron" + "\n");
    }

    public void refuseCommand(Client client, double bill) {
        System.out.println("**********************");
        System.out.println("The client " + client.getId() + " does not have the required amount!");
        System.out.println("BILL: " + bill + " Ron" + "\n");
    }

    public void clientBuys(Client client) {
        double bill = getBill(commands.get(client));
        if (client.getMoney() < bill) {
            refuseCommand(client, bill);
        } else {
            client.buyDrink(bill);
            displayCommand(client, bill);
            commands.remove(client);
        }
    }
}
