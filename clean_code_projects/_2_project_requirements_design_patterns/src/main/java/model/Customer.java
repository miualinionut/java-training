package model;
/**
 * Here is the main entity that represents a customer/client in our application.
 * It has an id, name, address, email and age
 * This class has 3 constructors - one with id, one without it and an empty one
 * For every parameter of the class we have getters and setters implemented
 */
public class Customer {
    private int id;
    private String name;
    private String address;
    private String email;
    private int age;

    /**
     * Full constructor of Customer class objects
     * @param id
     * @param name
     * @param address
     * @param email
     * @param age
     */
    public Customer(int id, String name, String address, String email, int age ){
        super();
        this.id = id;
        this.name = name;
        this.address= address;
        this.email = email;
        this.age = age;
    }
    public Customer(){

    }

    /**
     * Constructor of the Customer class objects used for CRUD operations
     * in SQL we have ids that are incremented automatically
     * @param name
     * @param address
     * @param email
     * @param age
     */
    public Customer(String name, String address, String email, int age ){
        super();
        this.name = name;
        this.address= address;
        this.email = email;
        this.age = age;
    }

    /**
     * Setter of id of Customer class objects
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Getter of id of Customer class objects
     * @return int
     */
    public int getId(){
        return this.id;
    }

    /**
     * Setter of the name of Customer class objects
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Getter of the name of Customer class objects
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * Setter of the address of Customer class objects
     * @param address
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * Getter of the address of Customer class objects
     * @return
     */
    public String getAddress(){
        return this.address;
    }

    /**
     * Setter of the email of Customer class objects
     * @param email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Getter of the email of Customer class objects
     * @return
     */
    public String getEmail(){
        return this.email;
    }

    /**
     * Setter of the age of Customer class objects
     * @param age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Getter of the age of Customer class ojects
     * @return
     */
    public int getAge(){
        return this.age;
    }

    /**
     * Method that overrides the toString() method of a Customer class object
     * @return
     */
    @Override
    public String toString(){
        return "Customer [id = "+ this.id + ", name= " + this.name + ", address " + this.address +", email= "+ this.email + ", age= "+this.age + "]\n";
    }

}
