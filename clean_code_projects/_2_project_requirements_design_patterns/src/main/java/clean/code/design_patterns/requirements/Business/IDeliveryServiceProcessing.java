package clean.code.design_patterns.requirements.Business;


import clean.code.design_patterns.requirements.Data.Person;
import clean.code.design_patterns.requirements.Presentation.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public interface IDeliveryServiceProcessing {

     void importProduct(String fileName);

     void viewProducts(DefaultTableModel tableModel);

     void addProduct(MenuItem menuItem);

     int deleteProduct(String name);

     int editProduct(MenuItem menuItem);

     void generateReport(Integer startingHour, Integer endingHour, Integer productAppearanceThreshold, Integer clientOrdersThreshold , Integer orderValueThreshold );

     CompositeProduct createCompProd(String title);

     void generateOrder(Person currClient);

     void search(DefaultTableModel tableModel, boolean greater, String productName, String field, Number numericVal);
}
