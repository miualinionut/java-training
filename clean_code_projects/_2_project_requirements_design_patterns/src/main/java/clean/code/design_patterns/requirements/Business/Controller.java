package clean.code.design_patterns.requirements.Business;

import clean.code.design_patterns.requirements.Data.AllUsers;
import clean.code.design_patterns.requirements.Data.Person;
import clean.code.design_patterns.requirements.Data.PersonTypes;
import clean.code.design_patterns.requirements.Data.Serialiser;
import clean.code.design_patterns.requirements.Presentation.GUI;

import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Controller {
    private Person currClient;
    private GUI gui;
    private DeliveryService deliveryService;

    private LogInController logInController;
    private AdminController adminController;
    private ClientController clientController;
    private EmployeeController employeeController;

    public Controller() {
        this.gui = new GUI();
        this.logInController = new LogInController();
        this.adminController = new AdminController();
        this.clientController = new ClientController();
        this.employeeController = new EmployeeController();
        if(!new File("src/main/resources/service.ser").exists() ) {
            this.deliveryService = new DeliveryService(gui);
        }
        else{
            this.deliveryService = Serialiser.deserialiseDeliveryService();
            this.deliveryService.setGUI(gui);
        }
        deliveryService.addObserver(employeeController);
        addListeners();
    }

    private void addListeners(){
        addReturnButtons();
        logInController.addListeners();
        adminController.addListeners();
        clientController.addListeners();
        employeeController.addListeners();

        windowListener();

    }

    private void windowListener(){
        gui.getAdminGUI().addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                Serialiser.serialiseDeliveryService(deliveryService);
            }

        });

        gui.getEmployeeGUI().addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                Serialiser.serialiseDeliveryService(deliveryService);
            }

        });

        gui.getClientGUI().addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                Serialiser.serialiseDeliveryService(deliveryService);
            }

        });

        gui.getLogInGUI().addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                Serialiser.serialiseDeliveryService(deliveryService);
            }

        });
    }

    private void addReturnButtons(){
        gui.getClientGUI().getReturnButton().addActionListener(e -> {
            gui.getClientGUI().setVisible(false);
            gui.getLogInGUI().setVisible(true);
        });

        gui.getEmployeeGUI().getReturnButton().addActionListener(e -> {
            gui.getEmployeeGUI().setVisible(false);
            gui.getLogInGUI().setVisible(true);
        });

        gui.getAdminGUI().getReturnButton().addActionListener(e -> {
            gui.getAdminGUI().setVisible(false);
            gui.getLogInGUI().setVisible(true);
        });

    }

    private class LogInController{


        private void addListeners(){
            logIn();
            register();
        }

        private void logIn(){
            gui.getLogInGUI().getLogInButton().addActionListener(e->{
                String username = gui.getLogInGUI().getUserTextField().getText();
                char[] password = gui.getLogInGUI().getPassPasswordField().getPassword();
                String pass = String.valueOf(password);

                Person person = new Person(username, pass);

                AllUsers allUsers = Serialiser.deserialiseUsers();

                PersonTypes personTypes = allUsers.checkExistence(person);

                switch (personTypes){
                    case ADMIN:
                        gui.getLogInGUI().setVisible(false);
                        gui.getAdminGUI().setVisible(true);
                        currClient = person;
                        break;
                    case EMPLOYEE:
                        gui.getLogInGUI().setVisible(false);
                        gui.getEmployeeGUI().setVisible(true);
                        currClient = person;
                        break;
                    case CLIENT:
                        gui.getLogInGUI().setVisible(false);
                        gui.getClientGUI().setVisible(true);
                        currClient = person;
                        break;
                    case BAD:
                        gui.getLogInGUI().getTextField1().setText("Bad user/password combination");
                        break;
                    case NONEXISTENT:
                        gui.getLogInGUI().getTextField1().setText("User does not exist.");
                        break;
                }
            });
        }

        private void register(){
            gui.getLogInGUI().getRegisterButton().addActionListener(e->{
                String username = gui.getLogInGUI().getUserTextField().getText();
                char[] password = gui.getLogInGUI().getPassPasswordField().getPassword();
                String pass = String.valueOf(password);

                Person person = new Person(username, pass);

                AllUsers allUsers = Serialiser.deserialiseUsers();
                PersonTypes personTypes = allUsers.checkExistence(person);

                if (personTypes == PersonTypes.NONEXISTENT){
                    allUsers.add(person);
                }
                else{
                    gui.getLogInGUI().getTextField1().setText("Cannot register, user already exists.");
                }

                Serialiser.serialiseUsers(allUsers);
            });
        }
    }

    private class AdminController{



        private void addListeners(){
            importButton();
            viewButton();
            addProductButton();
            deleteButton();
            editButton();
            generateButton();
            addCompProdButton();
            removeCompProdButton();
            createCompProdButton();
        }

        private void importButton(){
            gui.getAdminGUI().getImportButton().addActionListener(e -> {
                String filePath = gui.getAdminGUI().getFileNameTextField().getText();
                deliveryService.importProduct(filePath);
            });

        }

        private void viewFunc(){
            cleanTable();
            deliveryService.viewProducts((DefaultTableModel) gui.getAdminGUI().getTable1().getModel());
        }

        private void viewButton(){
            gui.getAdminGUI().getViewButton().addActionListener(e -> {
                viewFunc();
            });
        }

        private void addProductButton(){
            gui.getAdminGUI().getAddButton().addActionListener(e->{
                try {
                    String title = gui.getAdminGUI().getNameTextField().getText();
                    Double rating = Double.parseDouble(gui.getAdminGUI().getRatingTextField().getText());
                    Integer calories = Integer.parseInt(gui.getAdminGUI().getCaloriesTextField().getText());
                    Integer protein = Integer.parseInt(gui.getAdminGUI().getProteinTextField().getText());
                    Integer fat = Integer.parseInt(gui.getAdminGUI().getFatTextField().getText());
                    Integer sodium = Integer.parseInt(gui.getAdminGUI().getSodiumTextField().getText());
                    Integer price = Integer.parseInt(gui.getAdminGUI().getPriceTextField().getText());

                    MenuItem menuItem = new BaseProduct(title, rating, calories, protein, fat, sodium, price);
                    deliveryService.addProduct(menuItem);
                    ArrayList<MenuItem> auxProd = Serialiser.deserialiseProducts();
                    auxProd.add(menuItem);
                    Serialiser.serialiseProducts(auxProd);

                    viewFunc();
                }
                catch (NumberFormatException numberFormatException){
                    gui.getAdminGUI().getNameTextField().setText("Please insert valid data");
                }
            });
        }

        private void deleteButton(){
            gui.getAdminGUI().getDeleteButton().addActionListener(e->{
                String productName = gui.getAdminGUI().getNameTextField().getText();

                int index = deliveryService.deleteProduct(productName);

                ArrayList<MenuItem> auxProd = Serialiser.deserialiseProducts();
                if(index != -1) {
                    auxProd.remove(index);
                }
                Serialiser.serialiseProducts(auxProd);
                viewFunc();
            });
        }

        private void editButton(){
            gui.getAdminGUI().getEditButton().addActionListener(e -> {
                try {
                    String title = gui.getAdminGUI().getNameTextField().getText();
                    Double rating = Double.parseDouble(gui.getAdminGUI().getRatingTextField().getText());
                    Integer calories = Integer.parseInt(gui.getAdminGUI().getCaloriesTextField().getText());
                    Integer protein = Integer.parseInt(gui.getAdminGUI().getProteinTextField().getText());
                    Integer fat = Integer.parseInt(gui.getAdminGUI().getFatTextField().getText());
                    Integer sodium = Integer.parseInt(gui.getAdminGUI().getSodiumTextField().getText());
                    Integer price = Integer.parseInt(gui.getAdminGUI().getPriceTextField().getText());

                    MenuItem menuItem = new BaseProduct(title, rating, calories, protein, fat, sodium, price);

                    int index = deliveryService.editProduct(menuItem);

                    ArrayList<MenuItem> auxProd = Serialiser.deserialiseProducts();
                    if(index != -1) {
                        auxProd.remove(index);
                        auxProd.add(index, menuItem);
                    }
                    Serialiser.serialiseProducts(auxProd);
                    viewFunc();

                }
                catch (NumberFormatException numberFormatException){
                    gui.getAdminGUI().getNameTextField().setText("Please insert valid data");
                }
            });
        }

        private void generateButton(){
            gui.getAdminGUI().getGenerateReportsButton().addActionListener(e -> {

                try{
                    Integer startingHour = Integer.parseInt(gui.getAdminGUI().getStartHTextField().getText());
                    Integer endingHour = Integer.parseInt(gui.getAdminGUI().getEndHTextField().getText());
                    Integer productAppearanceThreshold = Integer.parseInt(gui.getAdminGUI().getProductThreshTextField().getText());
                    Integer clientOrdersThreshold = Integer.parseInt(gui.getAdminGUI().getClientThreshTextField().getText());
                    Integer orderValueThreshold = Integer.parseInt(gui.getAdminGUI().getOrderThreshTextField().getText());

                    deliveryService.generateReport(startingHour, endingHour, productAppearanceThreshold, clientOrdersThreshold, orderValueThreshold);
                }
                catch (NumberFormatException numberFormatException){
                    gui.getAdminGUI().getStartHTextField().setText("Please input numbers wherever appropriate.");
                }
            });
        }


        private void addCompProdButton(){
            gui.getAdminGUI().getAddButton1().addActionListener(e -> {
                String itemTitle = gui.getAdminGUI().getNameTextField().getText();
                ArrayList<MenuItem> allItems = Serialiser.deserialiseProducts();

                Integer compLocation = MenuItem.getLocationIndex(allItems, itemTitle);

                if(compLocation != -1){
                    gui.getAdminGUI().getComboBox1().addItem(itemTitle);

                }
                else{
                    gui.getAdminGUI().getNameTextField().setText("No such item exists.");
                }
            });
        }

        private void removeCompProdButton(){
            gui.getAdminGUI().getRemoveButton().addActionListener(e -> {
                if (gui.getAdminGUI().getComboBox1().getItemCount() != 0) {
                    int currItem = gui.getAdminGUI().getComboBox1().getSelectedIndex();
                    gui.getAdminGUI().getComboBox1().removeItemAt(currItem);
                }
            });
        }

        private void createCompProdButton(){
            gui.getAdminGUI().getCreateNewProductButton().addActionListener(e -> {
                String title = gui.getAdminGUI().getNewNameTextField().getText();
                CompositeProduct compositeProduct = deliveryService.createCompProd(title);

                ArrayList<MenuItem> auxProd = Serialiser.deserialiseProducts();
                auxProd.add(compositeProduct);
                Serialiser.serialiseProducts(auxProd);
            });
        }

        private void cleanTable(){
            DefaultTableModel model = (DefaultTableModel) gui.getAdminGUI().getTable1().getModel();
            model.setRowCount(0);
        }

    }

    private class ClientController{
        private void addListeners(){
            viewButton();
            searchButton();
            addButton();
            removeButton();
            orderButton();
        }

        private void viewButton(){
            gui.getClientGUI().getViewButton().addActionListener(e->{
                cleanTable();
                deliveryService.viewProducts((DefaultTableModel) gui.getClientGUI().getTable1().getModel());
            });
        }

        private void searchButton(){
            gui.getClientGUI().getSearchButton().addActionListener(e->{
                cleanTable();
                String title = gui.getClientGUI().getNameTextField().getText();
                boolean greater = gui.getClientGUI().getGreaterSmallerComboBox().getSelectedItem().equals(">")?true : false;
                String field = (String) gui.getClientGUI().getFieldComboBox().getSelectedItem();
                Number numericVal = Integer.parseInt(gui.getClientGUI().getNumericValueTextField().getText());

                deliveryService.search((DefaultTableModel) gui.getClientGUI().getTable1().getModel(), greater, title, field, numericVal);

            });
        }

        private void addButton(){
            gui.getClientGUI().getAddButton().addActionListener(e->{
                String itemTitle = gui.getClientGUI().getNameTextField().getText();
                ArrayList<MenuItem> allItems = Serialiser.deserialiseProducts();

                Integer compLocation = MenuItem.getLocationIndex(allItems, itemTitle);

                if(compLocation != -1){
                    gui.getClientGUI().getOrderComboBox().addItem(itemTitle);
                }
                else{
                    gui.getClientGUI().getNameTextField().setText("No such item exists");
                }
            });
        }

        private void removeButton(){
            gui.getClientGUI().getRemoveButton().addActionListener(e->{
                if (gui.getClientGUI().getOrderComboBox().getItemCount() != 0) {
                    int currItem = gui.getClientGUI().getOrderComboBox().getSelectedIndex();
                    gui.getClientGUI().getOrderComboBox().removeItemAt(currItem);
                }
            });
        }

        private void orderButton(){
            gui.getClientGUI().getFinaliseOrderButton().addActionListener(e->{
                if (gui.getClientGUI().getOrderComboBox().getItemCount() > 0) {
                    deliveryService.generateOrder(currClient);
                }
            });
        }

        private void cleanTable(){
            DefaultTableModel model = (DefaultTableModel) gui.getClientGUI().getTable1().getModel();
            model.setRowCount(0);
        }
    }

    private class EmployeeController implements Observer{

        private void addListeners(){
            clearButton();
        }

        private void clearButton(){
            gui.getEmployeeGUI().getClearNotificationButton().addActionListener(e -> {
                gui.getEmployeeGUI().getTextField1().setText("");
            });
        }

        @Override
        public void update(Observable o, Object arg) {
            gui.getEmployeeGUI().getTextField1().setText("An order has been added!");
        }
    }

}
