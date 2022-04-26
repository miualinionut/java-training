package model;

/**
 * Here is the main entity that represents a bill/invoice/order in our application.
 * It has an orderId, clientId, productId, quantity and a cost (total cost).
 * This class has 3 constructors - one with orderId, one without it and an empty one
 * For every parameter of the class we have getters and setters implemented
 */
public class Bill {
    private int orderId;
    private int clientId;
    private int productId;
    private int quantity;
    private int cost;

    /**
     * Full constructor of the class Bill, contains all it's attributes
     * @param orderId
     * @param clientId
     * @param productId
     * @param productQuantity
     * @param cost
     */
    public Bill(int orderId, int clientId, int productId, int productQuantity, int cost){
        super();
        this.orderId = orderId;
        this.clientId = clientId;
        this.quantity = productQuantity;
        this.productId = productId;
        this.cost = cost;
    }

    /**
     * Constructor of the class Bill used in CRUD operations
     * @param clientId
     * @param productId
     * @param productQuantity
     * @param cost
     */
    public Bill(int clientId, int productId, int productQuantity, int cost){
        super();
        this.productId = productId;
        this.quantity = productQuantity;
        this.clientId = clientId;
        this.cost = cost;
    }
    public Bill(){

    }

    /**
     * Ovveride of the toString() method
     * @return String
     */
    @Override
    public String toString(){
        return "Order [orderId = " + this.orderId + ", clientId= " + this.clientId +
                ", productId= " + this.productId + ", quantity = " + this.quantity+ ", cost =" + this.cost + "]\n";
    }

    /**
     * Setter of orderId of Bill class objects
     * @param n
     */

    public void setOrderId(int n){
        this.orderId = n;
    }

    /**
     * Setter of clientId of Bill class objects
     * @param n
     */
    public void setClientId(int n){
        this.clientId = n;
    }

    /**
     * Setter of cost of Bill class objects
     * @param n
     */
    public void setCost(int n){
        this.cost = n;
    }

    /**
     * Setter of productId of Bill class objects
     * @param n
     */
    public void setProductId(int n){
        this.productId = n;
    }

    /**
     * Setter of quantity of Bill class objects
     * @param n
     */
    public void setQuantity(int n){
        this.quantity = n;
    }

    /**
     * Getter of cost of Bill class objects
     * @return
     */
    public int getCost(){
        return this.cost;
    }

    /**
     * Getter of orderId of Bill class objects
     * @return
     */
    public int getOrderId(){
        return this.orderId;
    }

    /**
     * Getter of clientId of Bill class objects
     * @return
     */
    public int getClientId(){
        return this.clientId;
    }

    /**
     * Getter of productId of Bill class objects
     * @return
     */
    public int getProductId(){
        return this.productId;
    }

    /**
     * Getter of quantity of Bill class objects
     * @return
     */
    public int getQuantity(){
        return this.quantity;
    }


}
