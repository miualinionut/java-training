package clean.code.design_patterns.requirements;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Workshop implements Serializable {

    private Car[] carsInside = new Car[12];
    private Car[] carsOutside = new Car[8];
    private Worker[] workers;
    private Integer cash;
    private Integer nrOfMinorParts;
    private Integer nrOfMajorParts;

    /**Constructor
     *
     * @param workers the workers that work in the shop
     * @param cash the shop's cash
     * @param nrOfMinorParts the number of parts for minor interventions
     * @param nrOfMajorParts the number of parts for major interventions
     */

    public Workshop(Worker[] workers, Integer cash, Integer nrOfMinorParts, Integer nrOfMajorParts) {
        this.workers = workers;
        this.cash = cash;
        this.nrOfMinorParts = nrOfMinorParts;
        this.nrOfMajorParts = nrOfMajorParts;
    }

    /**Setter for the cars inside the workshop
     *
     * @param carsInside the cars which will now be inside the workshop
     */

    public void setCarsInside(Car[] carsInside) {
        this.carsInside = carsInside;
    }

    /** Setter for the cars outside the workshop
     *
     * @param carsOutside the cars which will now be in the yard
     */

    public void setCarsOutside(Car[] carsOutside) {
        this.carsOutside = carsOutside;
    }

    /**Setter for the workers employed by the shop
     *
     * @param workers the worker which will now work in the shop
     */

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    /**Getter for the shop's money
     *
     * @return cash the workshop's current cash
     */

    public Integer getCash() {
        return cash;
    }

    /**Setter for the shop's money
     *
     * @param cash the amount of money which the shop will now have
     */

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    /**Getter for the number of minor parts
     *
     * @return nrOfMinorParts the number of parts for minor interventions in the shop
     */

    public Integer getNrOfMinorParts() {
        return nrOfMinorParts;
    }

    /**Setter for the number of minor parts
     *
     * @param nrOfMinorParts the number of parts for minor interventions which the shop will now have
     */

    public void setNrOfMinorParts(Integer nrOfMinorParts) {
        this.nrOfMinorParts = nrOfMinorParts;
    }

    /**Getter for the number of major parts
     *
     * @return nrOfMinorParts the number of parts for major interventions in the shop
     */

    public Integer getNrOfMajorParts() {
        return nrOfMajorParts;
    }

    /**Setter for the number of major parts
     *
     * @param nrOfMajorParts the number of parts for major interventions which the shop will now have
     */

    public void setNrOfMajorParts(Integer nrOfMajorParts) {
        this.nrOfMajorParts = nrOfMajorParts;
    }

    /**Getter for the cars inside the shop
     *
     * @return carsInside the cars which are now inside the shop
     */

    public Car[] getCarsInside() {
        return carsInside;
    }

    /**Getter for the cars inside the shop
     *
     * @return carsOutside the cars which are now outside the shop
     */

    public Car[] getCarsOutside() {
        return carsOutside;
    }

    /**Getter for the workers employed by the shop
     *
     * @return workers the workers which are employed by the shop
     */

    public Worker[] getWorkers() {
        return workers;
    }



    /**Order minor parts
     *
     * @param numberOfParts how many parts we want to order
     * @param workshop our workshop
     * We check if we have enough money for the order, and then we order the parts
     *
     */



    public static void orderMinorParts(int numberOfParts, Workshop workshop){
        int priceOfPart = 125;
        if(workshop.getCash() > numberOfParts*priceOfPart) {
            workshop.setNrOfMinorParts(workshop.getNrOfMinorParts() + numberOfParts);
            workshop.setCash(workshop.getCash() - numberOfParts * priceOfPart);
        }
        else{
            System.out.println("Insufficient funds");
        }
    }

    /**Order major parts
     *
     * @param numberOfParts how many parts we want to order
     * @param workshop our workshop
     * We check if we have enough money for the order, and then we order the parts
     *
     */

    public static void orderMajorParts (int numberOfParts, Workshop workshop){
        int priceOfPart = 500;
        if(workshop.getCash() > numberOfParts * priceOfPart) {
            workshop.setNrOfMajorParts(workshop.getNrOfMajorParts() + numberOfParts);
            workshop.setCash(workshop.getCash() - numberOfParts * priceOfPart);
        }
        else{
            System.out.println("Insufficient funds");
        }
    }

    /** Assigning work to our workers
     *
     * @param workshop our workshop
     * Since a worker can only work on a maximum of 1 car in the course of an hour
     * we hand out a maximum of 8 tasks(the max number of cars in our shop)
     * we check every car in the shop, and every worker, to see if they are idle.
     * If they are, we choose a task for them.
     * The car we work on is chosen at random, in order to avoid having a bias for
     * the first cars in the shop.
     */

    public static void assignWork(Workshop workshop){
        Random rand = new Random(System.currentTimeMillis());

        int j =  0;
        Worker[] workers = workshop.getWorkers();
        int workerTasks = 0;
        Car[] cars = workshop.getCarsInside();
        boolean allWorkersWorking = workshop.allWorkersWorking(workshop);
        boolean allCarsWorked = workshop.allCarsWorkedOn(workshop);
        while(allCarsWorked == false && allWorkersWorking == false && workerTasks < workers.length && workerTasks < cars.length){
            j = rand.nextInt(cars.length);
            if(cars[j] != null && cars[j].isWorkedOn() == false && workers[workerTasks] != null && workers[workerTasks].isWorking() ==  false) {
                workers[workerTasks].chooseAction(cars[j], workshop);
                workerTasks++;
            }
        }
    }

    /** Generate random cars
     *
     * @param workshop our workshop
     * @param plateFile file used to generate car randomly
     * @param numberFile file used to generate car randomly
     * @param modelFile file used to generate car randomly
     * @param plateLen length of number plate file
     * @param numberLen length of phone number file
     * @param modelLen length of model file
     * @throws FileNotFoundException thrown when input files cannot be opened
     * Method used to generate cars randomly, to simulate new cars constantly coming to the workshop
     */

    public static Car createNewCar(Workshop workshop, File plateFile, File numberFile, File modelFile, Integer plateLen, Integer numberLen, Integer modelLen) throws FileNotFoundException {
        int i;
        Random rand = new Random();
        int plateAux, numAux, modelAux;
        Scanner plateScanner = new Scanner(plateFile);
        Scanner numScanner = new Scanner(numberFile);
        Scanner modelScanner = new Scanner(modelFile).useDelimiter("\\n");
        plateAux = rand.nextInt(plateLen);
        numAux = rand.nextInt(numberLen);
        modelAux = rand.nextInt(modelLen);
        //System.out.println(plateAux);
        //System.out.println(numAux);
        //System.out.println(modelAux);
        String plates = "uninitialised";
        String number = "uninitialised";
        String model = "uninitialised";
        for(i = 0; i < plateAux; i++){
            plates = plateScanner.next();
        }
        for(i = 0; i < numAux; i++){
            number = numScanner.next();
        }
        for(i = 0; i < modelAux; i++){
            model = modelScanner.next();
        }
        plateScanner.close();
        numScanner.close();
        modelScanner.close();

        Car car = new Car.CarBuilder(plates, number, model).build();
        return car;
    }

    /**Add a car to the yard
     *
     * @param workshop our workshop
     * @param car the car we wish to add
     * We find the first empty space in the yard
     * If we find it, we fill it with our car
     * Otherwise we print out the fact that the workshop is full
     */

    public static void addCarOutside(Workshop workshop, Car car){
        Car[] carsOutside = workshop.getCarsOutside();
        int i;
        for(i =0; i < carsOutside.length; i++){
            if (carsOutside[i] == null){
                carsOutside[i] = car;
                return;
            }
        }
        workshop.setCarsOutside(carsOutside);
        System.out.println("Workshop full");

    }

    /** Moving cars from outside to inside
     *
     * @param workshop our workshop
     * We check if any free spots exist in the shop.
     * If they exist, we bring a car from the yard inside, otherwise, we do nothing
     */

    public static void moveCarsInside(Workshop workshop) {
        Car[] carsInside = workshop.getCarsInside();
        Car[] carsOutside = workshop.getCarsOutside();

        for(int i = 0; i < carsInside.length; i++){
            if(carsInside[i] == null){
                for(int j = 0; j < carsOutside.length; j++){
                    if(carsOutside[j] != null){
                        carsInside[i] = carsOutside[j];
                        carsOutside[j] = null;
                        System.out.println("Car " + carsInside[i].getLicensePlate() + " added inside");
                    }
                }
            }
        }
        workshop.setCarsOutside(carsOutside);
        workshop.setCarsInside(carsInside);

    }

    /** Remove cars from the shop
     *
     * @param workshop our workshop
     * @param outputFile a file in which we store all the cars that were serviced by the workshop
     * We check if any cars have had their owners called.
     * If they do, we remove them, and add the money from the repair to the shop's cash
     */

    public static void removeExistingCars(Workshop workshop, File outputFile) {
        int i, j;
        Car[] cars = workshop.getCarsInside();
        for (i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                if (cars[i].isOwnerCalled() == true) {
                    if (cars[i].getRepairProgress() == Car.minorRepairProgressNeeded) {
                        workshop.writeToFile(cars[i], outputFile);

                        System.out.println("Car " + cars[i].getLicensePlate() + "  with minor damage removed");
                        for (j = i; j < cars.length - 1; j++) {
                            cars[j] = cars[j + 1];
                        }
                        workshop.setCash(workshop.getCash() + 250);
                    }
                    else {
                        workshop.writeToFile(cars[i], outputFile);

                        System.out.println("Car " + cars[i].getLicensePlate() + " with major damage removed");
                        for (j = i; j < cars.length - 1; j++) {
                            cars[j] = cars[j + 1];
                        }
                        workshop.setCash(workshop.getCash() + 1000);
                    }
                }
            }
        }
    }

    private void writeToFile(Car car, File outputFile){
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            String aux;
            if(car.getRepairProgress() > 2){
                aux = "Minor damage";
            }
            else{
                aux = "Major damage";
            }
            fileWriter.write(aux + " ");
            fileWriter.write(car.getLicensePlate() + " ");
            fileWriter.write(car.getCarModel() + " ");
            fileWriter.write(" \n");
            fileWriter.close();
        }
        catch (IOException ioe){
            System.out.println("Could not open the car history file, aborting");
        }
    }

    /** Paying salaries
     *
     * @param workshop our workshop
     * We pay out the salaries to every worker, and take out said sum from the shop cash
     */

    public static void paySalaries(Workshop workshop){
        Worker[] workers = workshop.getWorkers();
        for(int i = 0; i < workers.length; i++){
            workshop.setCash(workshop.getCash()-workers[i].getSalary());
        }
    }

    /** Clearing work
     *
     * @param workshop our workshop
     * In order to not have every worker work on the same car, we set a flag
     * to both them and the car, to show that they already have something to do.
     * This functions clears said flags, from both the cars, and the workers.
     */
    public static void clearWork(Workshop workshop){
        int i;
        Worker[] workers = workshop.getWorkers();
        Car[] cars = workshop.getCarsInside();
        for(i = 0; i < workers.length; i++){
            if(workers[i] != null) {
                workers[i].setWorking(false);
            }
        }
        for(i = 0; i < cars.length; i++){
            if(cars[i] != null) {
                cars[i].setWorkedOn(false);
            }
        }
    }

    /** function to check if all workers are working
     *
     * @param workshop our workshop
     * @return allWorking a parameter, true if everyone is working, false otherwise
     */

    private boolean allWorkersWorking(Workshop workshop){
        Worker[] workers = workshop.getWorkers();
        int i;
        boolean allWorking = true;
        for(i = 0; i < workers.length; i++){
            if(workers[i] != null) {
                if (workers[i].isWorking() == false) {
                    allWorking = false;
                }
            }
        }
        return allWorking;
    }

    /** function to check if all cars are being worked on
     *
     * @param workshop our workshop
     * @return allWorked a parameter, true if all cars are worked on, false otherwise
     */

    private boolean allCarsWorkedOn(Workshop workshop){
        Car[] cars = workshop.getCarsInside();
        int i;
        boolean allWorked = true;
        for(i = 0; i < cars.length; i++){
            if(cars[i] != null) {
                if (cars[i].isWorkedOn() == false) {
                    allWorked = false;
                }
            }
        }
        return  allWorked;
    }

    public Workshop getWorkshop (){
        return this;
    }
}