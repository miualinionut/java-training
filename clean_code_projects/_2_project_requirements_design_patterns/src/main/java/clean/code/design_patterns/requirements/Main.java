package clean.code.design_patterns.requirements;

import java.io.Serializable;

enum OrderedPizzaStatus {
    /** Ordered Pizza Status Enum
     * This Enum gives us the statuses which our pizza can have.
     *  Depending on the enum, we will choose the state in which the pizza appears.
     */
    NOTSTARTEDYET,
    UNFINISHED,
    READYTOORDER
}

public class PizzaShop implements Serializable {
    private final String orderedPizza; //the type of the pizza that the customer ordered
    private final String pizzaSize; //the size of the ordered pizza 16/32/50cm
    private final String customerName; //the name of the customer
    private final String customerPhoneNumber; //the phone number of the customer
    private OrderedPizzaStatus orderedPizzaStatus; //the status of the ordered pizza
    private Integer pizzaProgress; //the progress in making the pizza
    private boolean isOwnerCalled; //whether the owner is called or not
    private boolean isFinished; //the state of the pizza

    /** Constructor
     * @param builder the builder used to construct our Pizza object
     * More explanations provided below
     * */

    private PizzaShop (PizzaBuilder builder){
        this.orderedPizza = builder.OrderedPizza;
        this.pizzaSize = builder.pizzaSize;
        this.customerName = builder.customerName;
        this.customerPhoneNumber = builder.customerPhoneNumber;
        this.orderedPizzaStatus = builder.orderedPizzaStatus;
        this.pizzaProgress = builder.pizzaProgress;
        this.isOwnerCalled = false;
        this.isFinished = false;
    }


    /**Getter for the ordered pizza
     *
     * @return orderedPizza the ordered pizza
     */


    public String getOrderedPizza() {
        return orderedPizza;
    }

    /**Getter for the customer's name
     *
     * @return customerName the customer's name
     */


    public String getCustomerName() {
        return customerName;
    }

    /**Getter for the customer's phone number
     *
     * @return customerPhoneNumber the customer's phone number
     */

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    /**Getter for the ordered pizza status
     *
     * @return orderedPizzaStatus the status of the pizza
     */


    public OrderedPizzaStatus getOrderedPizzaStatusStatus() {
        return orderedPizzaStatus;
    }

    /**Setter for the ordered pizza's status
     *
     * @param orderedPizzaStatus the status of the ordered pizza that we wish to set
     */

    public void setOrderedPizzaStatus(OrderedPizzaStatus orderedPizzaStatus) {
        this.orderedPizzaStatus = orderedPizzaStatus;
    }

    /**Getter to check if the owner is called
     *
     * @return isOwnerCalled boolean which checks if the owner is called
     */

    public boolean isOwnerCalled() {
        return isOwnerCalled;
    }

    /**Getter to check if the pizza is finished (ready to deliver)
     *
     * @return isFinished boolean which checks if the pizza is currently finished
     */

    public boolean isFinished() {
        return isFinished;
    }

    /**Setter to check if the pizza is finished (ready to deliver)
     *
     * @param finished boolean which checks if the pizza is currently finished
     */

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    /**Setter for calling the owner
     *
     * @param ownerCalled boolean which tells us if the customer has been called or not
     */

    public void setOwnerCalled(boolean ownerCalled) {
        isOwnerCalled = ownerCalled;
    }

    /** Calling the customer
     *  This method tells us that the pizza order is ready,
     *  and signals that it will be delivered in the next hour,
     *  as its owner has been called to be let known of this
     */

    public void callOwner(){
        this.isOwnerCalled = true;
    }

    public static class PizzaBuilder {
        //mandatory
        private final String customerName;
        private final String customerPhoneNumber;
        private final String OrderedPizza;
        private final String PizzaSize;
        //optional
        private OrderedPizzaStatus orderedPizzaStatus;

        /** Constructor
         *
         * @param customerName the name of the customer who just ordered
         * @param customerPhoneNumber the phone number of the customer
         * @param OrderedPizza the type of the pizza
         * @param PizzaSize the size of the pizza that just has been ordered (16/32/50cm)
         */


        public PizzaBuilder(String customerName, String customerPhoneNumber, String OrderedPizza, String PizzaSize){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
            this.OrderedPizza = OrderedPizza;
            this.PizzaSize = PizzaSize;
        }

        /**Progress incrementer
         *  Increments the pizza's preparing progress, used in the pizzaProgress method
         */
        public void incrementRepairProgress(){
            this.pizzaProgress++;
        }

        /** Setter for the pizza progress parameter
         * @param pizzaProgress the cooking progress of the pizza
         * Sets the making progress of the pizza, only if the status is appropriate
         */

        public PizzaBuilder setPizzaProgress(Integer pizzaProgress){
            if(this.orderedPizzaStatus == OrderedPizzaStatus.NOTSTARTEDYET || this.orderedPizzaStatus == OrderedPizzaStatus.UNFINISHED){
                this.pizzaProgress = pizzaProgress;
            }
            else{
                this.pizzaProgress = 0;
            }
            return this;
        }

        /** Setter for the status of the ordered pizza
         * @param orderedPizzaStatus the status of the ordered pizza
         * Sets the status of your ordered pizza
         */

        public PizzaBuilder setOrderedPizzaStatus(OrderedPizzaStatus orderedPizzaStatus){
            this.orderedPizzaStatus = orderedPizzaStatus;
            return this;
        }

        /** Builder method
         * @return new Car the new car, created by the builder
         * This method is used to turn our builder into a car object
         * if the carStatus and repairProgress fields are not set
         * by the builder, they will be defaulted to UNDIAGNOSED and
         * 0, respectively
         */
        public PizzaShop build(){
            if (this.orderedPizzaStatus == null){
                this.orderedPizzaStatus = OrderedPizzaStatus.NOTSTARTEDYET;
            }
            if(this.pizzaProgress == null){
                this.pizzaProgress = 0;
            }
            return new OrderedPizza(this);
        }
    }

}