package filesaving;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import connection.ConnectionFactory;
import org.w3c.dom.Text;

import javax.xml.transform.Result;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 * FileSavingBill represents the class that is used in generally for creating a new pdf file with the data of an order that we selected from GUI
 * firstly, it has a query that makes a join interrogation on our tables in order to get the details in a resultSet
 * secondly, it converts the resultSet's data in a string
 * lastly, it would open a new document and create a new pdf file "bil_xx.pdf", where xx - represents the bill id we selected to be printed
 */

public class FileSavingBill {
    String query = "SELECT bill.orderId as 'OrderId', customer.id as 'CustomerId', customer.name as 'CustomerName', " +
            "customer.address as 'CustomerAddress', customer.email as 'CustomerEmail', product.id as 'ProductId'," +
            " product.name as 'ProductName', bill.quantity as 'ProductQuantity', bill.cost as 'TotalCost'" +
            "FROM bill join customer on (bill.clientId = customer.id) join product on (bill.productId = product.id)"
            +"WHERE bill.orderId = ?";

    /**
     * method that has a ResultSet as parameter and returns a String
     * the String returned represents the to string to the bill that is going to be printed in pdf file
     * @param rs
     * @return string
     */
    private String getBillString(ResultSet rs){
        StringBuilder sb = new StringBuilder();
        sb.append("CURRENT BILL:\n");
        try{
            while(rs.next()) {
                int orderId = rs.getInt("OrderId");
                int customerId = rs.getInt("CustomerId");
                String customerName = rs.getString("CustomerName");
                String customerAddress = rs.getString("CustomerAddress");
                String customerEmail = rs.getString("CustomerEmail");
                int productId = rs.getInt("ProductId");
                String productName = rs.getString("ProductName");
                int productQuantity = rs.getInt("ProductQuantity");
                int totalCost = rs.getInt("TotalCost");
                sb.append("\nORDER DETAILS:\n");
                sb.append("OrderId: " + orderId);

                sb.append("\nCUSTOMER DETAILS:");
                sb.append("\nCustomerId: "+ customerId);
                sb.append("\nCustomerName: " + customerName);
                sb.append("\nCustomerAddress: "+ customerAddress);
                sb.append("\nCustomerEmail: " + customerEmail);

                sb.append("\nPRODUCT DETAILS:");
                sb.append("\nProductId: " + productId);
                sb.append("\nProductName: "+ productName);
                sb.append("\nProductQuantity: " + productQuantity);

                sb.append("\nTOTAL COST: " + totalCost);
                return sb.toString();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionFactory.close(rs);
        }
        return null;
    }

    /**
     * Method that interrogates the database using a select query in order to get
     * the invoice information that we need to display
     * @param billId
     * @return result - bill in string form ready to be displayed in the pdf file
     */
    public String getBill(int billId){
        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            statement = dbConnection.prepareStatement(query);

            statement.setInt(1, billId);
            System.out.println(statement.toString());
            statement.executeQuery();
            resultSet = statement.getResultSet();
            String result = getBillString(resultSet);
            System.out.println(result);
            return result;
        } catch (SQLException e){
          e.printStackTrace();
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(dbConnection);
        }
        return null;
    }

    /**
     * Method that opens a new document and saves the information about the selected bill
     * in a pdf file named bil_xxx.pdf, where xxx represents the bill id in the main table
     * @param billId
     * @throws DocumentException
     * @throws FileNotFoundException
     */
    public void saveBillInFile(int billId) throws DocumentException, FileNotFoundException {
        String bill = getBill(billId);
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("bill_"+ billId + ".pdf"));
        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Paragraph para = new Paragraph(bill, font);
        document.add(para);
        document.close();
    }

}
