package clean.code.design_patterns.requirements;

import java.io.Serializable;

enum CarStatus {
    /** Car Status Enum
     * This Enum gives us the statuses which our car can have.
     *  Depending on the enum, we will choose what will happen to the car.
     *
     *
     */
    UNDIAGNOSED,
    MINOR_DAMAGE,
    SERIOUS_DAMAGE,
    READY
}

public class Car implements Serializable {
    public static final int majorRepairProgressNeeded = 5;
    public static final int minorRepairProgressNeeded = 2;


    private String licensePlate;
    private String customerPhoneNumber;
    private CarStatus carStatus;
    private Integer repairProgress;
    private String carModel;
    private boolean isOwnerCalled;
    private boolean isWorkedOn;

    /** Constructor
     * @param builder the builder used to construct our Car object
     * More explanations provided below
     * */

    private Car (CarBuilder builder){
        this.licensePlate = builder.licensePlate;
        this.customerPhoneNumber = builder.customerPhoneNumber;
        this.carModel = builder.carModel;
        this.repairProgress = builder.repairProgress;
        this.carStatus = builder.carStatus;
        this.isOwnerCalled = false;
        this.isWorkedOn = false;
    }


    /**Getter for license plate
     *
     * @return licensePlate the car's license plate
     */


    public String getLicensePlate() {

        return licensePlate;
    }

    /**Getter for the customer's phone number
     *
     * @return customerPhoneNumber the customer's phone number
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    /**Getter for the car status
     *
     * @return carStatus the car's status
     */


    public CarStatus getCarStatus() {
        return carStatus;
    }

    /**Setter for the car's status
     *
     * @param carStatus the car status we wish to set
     */

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    /**Progress incrementer
     *  Increments the car's repair progress, used in the repair method
     */

    public void incrementRepairProgress(){
        this.repairProgress++;
    }

    /**Getter for the repair progress
     *
     * @return repairProgress this car's current repair progress
     */

    public Integer getRepairProgress() {
        return repairProgress;
    }

    /**Getter for the car's model
     *
     * @return carModel this car's model
     */


    public String getCarModel() {
        return carModel;
    }

    /**Getter to check if the owner is called
     *
     * @return isOwnerCalled boolean which checks if the owner is called
     */

    public boolean isOwnerCalled() {
        return isOwnerCalled;
    }

    /**Getter to check if the car is worked on
     *
     * @return isWorkedOn boolean which checks if the car is currently worked on
     */

    public boolean isWorkedOn() {
        return isWorkedOn;
    }

    /**Setter to set if the car is worked on or not
     *
     * @param workedOn boolean which gives us if the car is worked on or not
     */

    public void setWorkedOn(boolean workedOn) {
        isWorkedOn = workedOn;
    }

    /**Setter for calling the owner
     *
     * @param ownerCalled boolean which tells us if the owner of the car has been called or not
     */

    public void setOwnerCalled(boolean ownerCalled) {
        isOwnerCalled = ownerCalled;
    }

    /** Calling the car's owner
     *  This method tells us that the car has been repaired,
     *  and signals that it will be removed in the next hour,
     *  as its owner has been called to pick it up
     */

    public void callOwner(){
        this.isOwnerCalled = true;
    }

    public static class CarBuilder {


        //mandatory
        private String licensePlate;
        private String customerPhoneNumber;
        private String carModel;
        //optional
        private CarStatus carStatus;
        private Integer repairProgress;

        /** Constructor
         *
         * @param licensePlate the license plate of the car we wish to build
         * @param customerPhoneNumber the phone number of the car owner
         * @param carModel the model of the car
         */


        public CarBuilder(String licensePlate, String customerPhoneNumber, String carModel){
            this.licensePlate = licensePlate;
            this.customerPhoneNumber = customerPhoneNumber;
            this.carModel = carModel;
        }

        /** Setter for the repair progress parameter
         * @param repairProgress the repair progress of the car
         * Sets the repair progress of the car, only if the status is appropriate
         */

        public CarBuilder setRepairProgress(Integer repairProgress){
            if(this.carStatus == CarStatus.SERIOUS_DAMAGE || this.carStatus == CarStatus.MINOR_DAMAGE){
                this.repairProgress = repairProgress;
            }
            else{
                this.repairProgress = 0;
            }
            return this;
        }
        /** Setter for the status of the car
         * @param carStatus the status of the car
         * Sets the status of our car
         */

        public CarBuilder setCarStatus(CarStatus carStatus){
            this.carStatus = carStatus;
            return this;
        }

        /** Builder method
         * @return new Car the new car, created by the builder
         * This method is used to turn our builder into a car object
         * if the carStatus and repairProgress fields are not set
         * by the builder, they will be defaulted to UNDIAGNOSED and
         * 0, respectively
         */
        public Car build(){
            if (this.carStatus == null){
                this.carStatus = CarStatus.UNDIAGNOSED;
            }
            if(this.repairProgress == null){
                this.repairProgress = 0;
            }
            return new Car(this);
        }
    }

}
