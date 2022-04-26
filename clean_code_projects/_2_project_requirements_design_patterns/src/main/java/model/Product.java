package model;
/**
 * Here is the main entity that represents a product in our application.
 * It has an id, name, price and stock
 * This class has 3 constructors - one with id, one without it and an empty one
 * For every parameter of the class we have getters and setters implemented
 */
public class Product {
    private int id;
    private String name;
    private int price;
    private int stock;

    /**
     * Full constructor of Product class objects
     * @param id
     * @param name
     * @param price
     * @param currentStock
     */
    public Product(int id, String name, int price, int currentStock){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = currentStock;
    }
    public Product(){

    }

    /**
     * Constructor of Product class objects used for database operations
     * in database, primary key of every table is automatically incremented
     * @param name
     * @param price
     * @param currentStock
     */
    public Product(String name, int price, int currentStock){
        super();
        this.name = name;
        this.price = price;
        this.stock = currentStock;
    }

    /**
     * Method that overrides toString() method of Product class objects
     * @return
     */
    @Override
    public String toString(){
        return "Product [id= " + this.id + ", name= " + this.name + ", price= " + this.price + ", stock= " + this.stock +"]\n";
    }

    /**
     * Getter of id of Product class object
     * @return
     */
    public int getId(){
        return this.id;
    }

    /**
     * Setter of the id of Product class object
     * @param n
     */
    public void setId(int n){
        this.id = n;
    }

    /**
     * Getter of the name of Product class objects
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * Setter of the name of Product class objects
     * @param s
     */
    public void setName(String s){
        this.name = s;
    }

    /**
     * Setter of the Price of Product class object
     * @param price
     */
    public void setPrice(int price){
        this.price=price;
    }

    /**
     * Getter of the price of Product class object
     * @return
     */
    public int getPrice(){
        return this.price;
    }

    /**
     * Setter of the stock of Product class object
     * @param currentStock
     */
    public void setStock(int currentStock){
        this.stock = currentStock;
    }

    /**
     * Getter of the stock of Product class object
     * @return
     */
    public int getStock(){
        return this.stock;
    }
}
