package clean.code.design_patterns.requirements.Data;

import clean.code.design_patterns.requirements.Business.MenuItem;
import clean.code.design_patterns.requirements.Business.Order;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ThingWriter {

    public static void writeHourReport(Integer startingHour, Integer endingHour, HashMap<Order, ArrayList<MenuItem>> orderHashMap){
        File file = new File("src/main/resources/hourReport.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Here are all the orders that were fulfilled between " + startingHour + " and " + endingHour + ":\n");
            Integer nrOfOrders = 0;

            ArrayList<Order> auxArr = (ArrayList<Order>) orderHashMap.keySet().stream().filter(e -> e.verifyHour(startingHour, endingHour)).collect(Collectors.toList());
            for (Order order: auxArr) {
                nrOfOrders++;
                fileWriter.write("Order " + order.getID() + " : " );
                for (MenuItem menuItem: order.getMenuItems()) {
                    fileWriter.write(menuItem.getTitle()+ " ");
                }
                fileWriter.write("\n");
            }

            fileWriter.write("Total number of orders: " + nrOfOrders+ "\n");

            fileWriter.close();
        }
        catch (IOException ioException){
            System.out.println("Could not write hour report.");
        }
    }

    public static void writeProductReport(Integer productThreshold, HashMap<Order, ArrayList<MenuItem>> orderHashMap){
        File file = new File("src/main/resources/productReport.txt");
        try{
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Here are all the products that were ordered more than " + productThreshold + " times:\n");
            ArrayList<MenuItem> auxArr = new ArrayList<>();
            for (ArrayList<MenuItem> menuItems: orderHashMap.values()){
                for (MenuItem menuItem: menuItems) {
                    auxArr.add(menuItem);
                }
            }
            HashMap<MenuItem, Integer> auxMap = new HashMap<>();

            for (MenuItem menuItem: auxArr) {
                int val = 1;
                if(auxMap.containsKey(menuItem)){
                    val = auxMap.get(menuItem);
                    val++;
                    auxMap.put(menuItem, val);
                }
                else {
                    auxMap.put(menuItem, val);
                }
            }

            ArrayList<MenuItem> goodArr = (ArrayList<MenuItem>) auxMap.keySet().stream().filter(e -> auxMap.get(e) > productThreshold).collect(Collectors.toList());
            int nrOfItems = 0;
            for (MenuItem menuItem: goodArr) {
                nrOfItems++;
                fileWriter.write(menuItem.getTitle()+ ", with a total of " + auxMap.get(menuItem) + " appearances \n");
            }
            fileWriter.write("Total number of items: " + nrOfItems);

            fileWriter.close();

        }
        catch (IOException ioException){
            System.out.println("Could not write product report.");
        }

    }

    public static void writeClientReport(Integer clientOrdersThreshold, Integer orderValueThreshold, HashMap<Order, ArrayList<MenuItem>> orderHashMap){
        File file = new File("src/main/resources/ClientReport.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Here are all the clients which placed at least " + clientOrdersThreshold + " orders, with a value of at least " + orderValueThreshold + " :\n");

            HashMap<Person, Integer> orderNrMap = new HashMap<>();
            HashMap<Person, Integer> valueMap = new HashMap<>();
            ArrayList<Order> auxArr = (ArrayList<Order>) orderHashMap.keySet().stream().collect(Collectors.toList());

            for (Order order : auxArr) {
                int val = 1;
                if (orderNrMap.containsKey(order.getClient())) {
                    val = orderNrMap.get(order.getClient());
                    val++;
                    orderNrMap.put(order.getClient(), val);
                } else {
                    orderNrMap.put(order.getClient(), val);
                }
            }

            for (Order order : auxArr) {
                int orderVal = MenuItem.getTotalPrice(order.getMenuItems());
                if (valueMap.containsKey(order.getClient())) {
                    orderVal += valueMap.get(order.getClient());
                    valueMap.put(order.getClient(), orderVal);
                } else {
                    valueMap.put(order.getClient(), orderVal);
                }
            }

            ArrayList<Person> goodClients = (ArrayList<Person>) orderNrMap.keySet().stream().filter(e -> orderNrMap.get(e) > clientOrdersThreshold && valueMap.get(e) > orderValueThreshold).collect(Collectors.toList());
            int i = 0;
            for (Person client: goodClients) {
                i++;
                fileWriter.write("Client " + i + ": " + client.getName() +", with " + orderNrMap.get(client) + " orders, worth " + valueMap.get(client) + "\n");

            }
            fileWriter.write("Total number of clients: " + i);

            fileWriter.close();
        }

        catch (IOException ioException){
            System.out.println("Could not write client report.");
        }
    }

    public static void writeBill(Order order){
        File file = new File("src/main/resources/order" + order.getID()+".txt");
        try {
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("Current order: " + order.getID() + "\n");
            fileWriter.write("Items bought by the customer: " + "\n");
            int totalValue = 0;
            for (MenuItem menuItem: order.getMenuItems()) {
                fileWriter.write("Name: " + menuItem.getTitle() + "\t\t\t Price:" + menuItem.getPrice() + "\n");
                totalValue += menuItem.getPrice();
            }
            fileWriter.write("Total value of order: " + totalValue + "\n");
            fileWriter.write("Order was bought by: " + order.getClient().getName()+ "\n");
            fileWriter.write("Order was fulfilled at: "+ order.getGregorianCalendar().getTime());

            fileWriter.close();
        }
        catch (IOException ioException){
            System.out.println("Could not write bill!");
        }
    }
}
