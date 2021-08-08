package clean.code.design_patterns.requirements.Data;

import clean.code.design_patterns.requirements.Business.DeliveryService;
import clean.code.design_patterns.requirements.Business.MenuItem;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialiser implements Serializable{

    public static void serialiseUsers(AllUsers allUsers){
        File file = new File("src/main/resources/users.ser");
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(allUsers);
            objOut.flush();

            objOut.close();
            fileOut.close();
            System.out.println("User serialisation successful.");
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("Could not create file.");
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException){
            System.out.println("I'm not sure how this can happen.");
            ioException.printStackTrace();
        }

    }

    public static void serialiseProducts(List<MenuItem> items){
        File file = new File("src/main/resources/products.ser");
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(items);
            objOut.flush();

            objOut.close();
            fileOut.close();
            System.out.println("Product serialisation successful.");
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("Could not create file.");
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException){
            System.out.println("I'm not sure how this can happen.");
            ioException.printStackTrace();
        }
    }

    public static void serialiseDeliveryService(DeliveryService deliveryService){
        File file = new File("src/main/resources/service.ser");
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            deliveryService.prepareForSerialisation();
            objOut.writeObject(deliveryService);
            objOut.flush();

            objOut.close();
            fileOut.close();
            System.out.println("Delivery Service serialisation successful.");
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("Could not create file.");
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException){
            System.out.println("I'm not sure how this can happen.");
            ioException.printStackTrace();
        }
    }

    public static AllUsers deserialiseUsers(){
        File file = new File("src/main/resources/users.ser");
        try {
            if (file.length() != 0) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);
                AllUsers allUsers = (AllUsers) objIn.readObject();
                fileIn.close();
                objIn.close();
                return allUsers;
            }
            else{
                throw new FileNotFoundException();
            }
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("users.ser could not be found");
            fileNotFoundException.printStackTrace();
        } catch (IOException | ClassNotFoundException weirdException) {
            System.out.println("I'm not sure how this can happen.");
            weirdException.printStackTrace();
        }
        return null;
    }

    public static ArrayList<MenuItem> deserialiseProducts(){
        File file = new File("src/main/resources/products.ser");
        try {
            if (file.length() != 0) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);

                ArrayList<MenuItem> items = new ArrayList<>();
                items = (ArrayList<MenuItem>) objIn.readObject();
                fileIn.close();
                objIn.close();
                return items;
            }
            else{
                throw new FileNotFoundException();
            }
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("products.ser could not be found");
            fileNotFoundException.printStackTrace();
        } catch (IOException | ClassNotFoundException weirdException) {
            System.out.println("I'm not sure how this can happen.");
            weirdException.printStackTrace();
        }
        return null;

    }

    public static DeliveryService deserialiseDeliveryService(){
        File file = new File("src/main/resources/service.ser");
        try {
            if (file.length() != 0) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);
                DeliveryService deliveryService = (DeliveryService) objIn.readObject();
                fileIn.close();
                objIn.close();
                return deliveryService;
            }
            else{
                throw new FileNotFoundException();
            }
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("service.ser could not be found");
            fileNotFoundException.printStackTrace();
        } catch (IOException | ClassNotFoundException weirdException) {
            System.out.println("I'm not sure how this can happen.");
            weirdException.printStackTrace();
        }
        return null;
    }
}