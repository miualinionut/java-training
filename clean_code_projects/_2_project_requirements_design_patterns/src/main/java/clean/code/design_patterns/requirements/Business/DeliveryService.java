package clean.code.design_patterns.requirements.Business;

import clean.code.design_patterns.requirements.Data.CSVReader;
import clean.code.design_patterns.requirements.Data.Person;
import clean.code.design_patterns.requirements.Data.Serialiser;
import clean.code.design_patterns.requirements.Data.ThingWriter;
import clean.code.design_patterns.requirements.Presentation.GUI;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class DeliveryService  extends Observable implements IDeliveryServiceProcessing, Serializable {
    private Serialiser serialiser = new Serialiser();
    private GUI gui;
    private HashMap<Order, ArrayList<MenuItem>> orderHashMap;

    public DeliveryService(GUI gui) {
        this.orderHashMap = new HashMap<>();
        this.gui = gui;
    }

    public void prepareForSerialisation(){
        this.gui = null;
    }

    public void setGUI(GUI gui){
        this.gui = gui;
    }

    @Override
    public void importProduct(String fileName){
        assert fileName != null;
        File serialisedFile = new File("src/main/resources/products.ser");
        if(serialisedFile.length() == 0 || !serialisedFile.exists()) {
            CSVReader csvReader = new CSVReader();
            List<MenuItem> allItems = csvReader.readCSV(fileName);
            Serialiser.serialiseProducts(allItems);
        }
        else{
            System.out.println("Cannot import, file already exists.");
        }
    }

    @Override
    public void viewProducts(DefaultTableModel tableModel){

        String[] columns = {"Title", "Rating", "Calories", "Protein", "Fat", "Sodium", "Price"};
        tableModel.setColumnIdentifiers(columns);

        ArrayList<MenuItem> menuItems = Serialiser.deserialiseProducts();
        for(MenuItem menuItem: menuItems){
            tableModel.addRow(menuItem.fieldsToArray());
        }
        Serialiser.serialiseProducts(menuItems);
    }

    @Override
    public void addProduct(MenuItem menuItem) {
        assert menuItem != null;
        DefaultTableModel tableModel = (DefaultTableModel) gui.getAdminGUI().getTable1().getModel();

        tableModel.addRow(menuItem.fieldsToArray());

    }

    @Override
    public int deleteProduct(String prodName) {
        assert prodName != null;
        for(int i = 0; i < gui.getAdminGUI().getTable1().getRowCount(); i++){
            if (gui.getAdminGUI().getTable1().getValueAt(i, 0).equals(prodName)){
                ((DefaultTableModel)gui.getAdminGUI().getTable1().getModel()).removeRow(i);
                assert i >= -1;
                return i;
            }
        }
        gui.getAdminGUI().getNameTextField().setText("No product with that name exists.");
        return -1;
    }

    @Override
    public int editProduct(MenuItem menuItem) {
        assert menuItem != null;
        String[] data = menuItem.fieldsToArray();
        for(int i = 0; i < gui.getAdminGUI().getTable1().getRowCount(); i++){
            if (gui.getAdminGUI().getTable1().getValueAt(i, 0).equals(menuItem.getTitle())){
               for(int j = 1; j < data.length; j++){
                   gui.getAdminGUI().getTable1().getModel().setValueAt(data[j], i, j);
               }
               assert i >= 0;
               return i;
            }
        }
        gui.getAdminGUI().getNameTextField().setText("No product has that name");
        return -1;

    }

    @Override
    public void generateReport(Integer startingHour, Integer endingHour, Integer productAppearanceThreshold, Integer clientOrdersThreshold , Integer orderValueThreshold ){
        ThingWriter.writeHourReport(startingHour, endingHour, orderHashMap);
        ThingWriter.writeProductReport(productAppearanceThreshold, orderHashMap);
        ThingWriter.writeClientReport(clientOrdersThreshold, orderValueThreshold, orderHashMap);
    }

    @Override
    public CompositeProduct createCompProd(String title){
        assert title != null;
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        ArrayList<MenuItem> allProducts = Serialiser.deserialiseProducts();

        for (int i = 0; i < gui.getAdminGUI().getComboBox1().getItemCount(); i++){
            MenuItem menuItem = MenuItem.getItemFromArrayList(allProducts, (String) gui.getAdminGUI().getComboBox1().getItemAt(i));
            if (menuItem != null){
                menuItems.add(menuItem);
            }
        }
        assert new CompositeProduct(title, menuItems) != null;
        return new CompositeProduct(title, menuItems);
    }
    @Override
    public void generateOrder(Person currClient){
        assert currClient != null;
        ArrayList<MenuItem> orderItems = new ArrayList<>();
        ArrayList<MenuItem> allProducts = Serialiser.deserialiseProducts();

        for(int i = 0; i < gui.getClientGUI().getOrderComboBox().getItemCount(); i++){
            MenuItem menuItem = MenuItem.getItemFromArrayList(allProducts, (String) gui.getClientGUI().getOrderComboBox().getItemAt(i));
            if(menuItem != null){
                orderItems.add(menuItem);
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        Order order = new Order(orderHashMap.size()+1, orderItems, currClient,gregorianCalendar);
        orderHashMap.put(order, orderItems);

        ThingWriter.writeBill(order);
        setChanged();
        notifyObservers();

        clearChanged();
    }

   @Override
   public void search(DefaultTableModel tableModel, boolean greater, String productName, String field, Number numericVal){
       String[] columns = {"Title", "Rating", "Calories", "Protein", "Fat", "Sodium", "Price"};
       tableModel.setColumnIdentifiers(columns);

       ArrayList<MenuItem> menuItems = Serialiser.deserialiseProducts();
       ArrayList<MenuItem> auxArr = searchName(menuItems, productName);

       switch (field){
           case "Rating":
               auxArr = searchRating(greater, numericVal, auxArr);
             break;
           case "Calories":
               auxArr = searchCalories(greater, numericVal, auxArr);
               break;
           case "Protein":
               auxArr = searchProtein(greater, numericVal, auxArr);
               break;
           case "Fat":
               auxArr = searchFat(greater, numericVal, auxArr);
               break;
           case "Sodium":
               auxArr = searchSodium(greater, numericVal, auxArr);
               break;
           case "Price":
               auxArr = searchPrice(greater, numericVal, auxArr);
               break;
       }

       for(MenuItem menuItem: auxArr){
           tableModel.addRow(menuItem.fieldsToArray());
       }
       Serialiser.serialiseProducts(menuItems);
   }

   private ArrayList<MenuItem> searchName(ArrayList<MenuItem> allItems, String name){
       return (ArrayList<MenuItem>) allItems.stream().filter(p -> p.getTitle().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
   }

   private ArrayList<MenuItem> searchRating(boolean greater, Number numericVal, ArrayList<MenuItem> allItems){
       if(greater){
           return (ArrayList<MenuItem>) allItems
                   .stream()
                   .filter(p -> p.getRating() >= numericVal.doubleValue())
                   .collect(Collectors.toList());
       }
       else{
           return (ArrayList<MenuItem>) allItems
                   .stream()
                   .filter(p -> p.getRating() < numericVal.doubleValue())
                   .collect(Collectors.toList());
       }
   }

    private ArrayList<MenuItem> searchCalories(boolean greater, Number numericVal, ArrayList<MenuItem> allItems){
        if(greater){
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getCalories() >= numericVal.intValue())
                    .collect(Collectors.toList());
        }
        else{
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getCalories() < numericVal.intValue())
                    .collect(Collectors.toList());
        }
    }

    private ArrayList<MenuItem> searchProtein(boolean greater, Number numericVal, ArrayList<MenuItem> allItems){
        if(greater){
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getProtein() >= numericVal.intValue())
                    .collect(Collectors.toList());
        }
        else{
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getCalories() < numericVal.intValue())
                    .collect(Collectors.toList());
        }
    }

    private ArrayList<MenuItem> searchFat(boolean greater, Number numericVal, ArrayList<MenuItem> allItems){
        if(greater){
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getFat() >= numericVal.intValue())
                    .collect(Collectors.toList());
        }
        else{
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getCalories() < numericVal.intValue())
                    .collect(Collectors.toList());
        }
    }

    private ArrayList<MenuItem> searchSodium(boolean greater, Number numericVal, ArrayList<MenuItem> allItems){
        if(greater){
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getSodium() >= numericVal.intValue())
                    .collect(Collectors.toList());
        }
        else{
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getCalories() < numericVal.intValue())
                    .collect(Collectors.toList());
        }
    }

    private ArrayList<MenuItem> searchPrice(boolean greater, Number numericVal, ArrayList<MenuItem> allItems){
        if(greater){
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getPrice() >= numericVal.intValue())
                    .collect(Collectors.toList());
        }
        else{
            return (ArrayList<MenuItem>) allItems
                    .stream()
                    .filter(p -> p.getCalories() < numericVal.intValue())
                    .collect(Collectors.toList());
        }
    }
}
