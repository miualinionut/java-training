package clean.code.design_patterns.requirements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Worker implements Serializable {

    private String name;
    private Integer salary;
    private Integer numberOfInterventions;
    private Integer hoursWorkedConsecutively;
    private boolean isWorking;

    private static final Integer seriousRepairThreshold = 5;

    /** Constructor
     *
     * @param builder our builder, used to construct the worker object
     * More explanations provided below
     */


    public Worker(WorkerBuilder builder){
        this.name = builder.name;
        this.salary = builder.salary;
        this.hoursWorkedConsecutively = 0;
        this.numberOfInterventions = builder.numberOfInterventions;;
        this.isWorking = false;
    }

    /**Getter for the worker's name
     *
     * @return name the worker's name
     */

    public String getName() {
        return name;
    }

    /**Getter for the worker's salary
     *
     * @return salary the car's salary
     */

    public Integer getSalary() {
        return salary;
    }

    /**Getter for the number of interventions the worker has taken part in
     *
     * @return numberOfInterventions the number of interventions the worker has partaken in
     */
    public Integer getNumberOfInterventions() {
        return numberOfInterventions;
    }

    /**Getter to check if the worker is working or not
     *
     * @return isWorking a boolean telling us if the worker is working or not
     */
    public boolean isWorking() {
        return isWorking;
    }

    /**Setter for the worker's working status
     *
     * @param working boolean parameter, telling us if the worker is working or not
     */

    public void setWorking(boolean working) {
        isWorking = working;
    }

    /**Getter for the number of hours worked consecutively
     *
     * @return hoursWorkedConsecutively the number of hours which the worker has worked, in a row
     */

    public Integer getHoursWorkedConsecutively() {
        return hoursWorkedConsecutively;
    }


    /**Method to increment the number of interventions of a worker
     * Increments the number of interventions of a worker
     */

    public void incrementNumberOfInterventions(){
        this.numberOfInterventions++;
    }

    /**Setter for the number of hours worked consecutively
     *
     * @param hoursWorkedConsecutively the new number of hours a worker has worked consecutively
     */

    public void setHoursWorkedConsecutively(Integer hoursWorkedConsecutively) {
        this.hoursWorkedConsecutively = hoursWorkedConsecutively;
    }

    /** Tell the worker to take a break
     *  In order to make the workers feel more like people
     *  instead of automatons, they need to take a break every 4 hours
     *  This method is called when we decide what each worker will do
     *
     */

    private void takeBreak(){
        System.out.println("Worker " + this.getName());
        System.out.println("is taking a break");
        this.setHoursWorkedConsecutively(0);
    }

    /** Car diagnosis
     *
     * @param car the car which we diagnose
     * This method takes a car as an input, and has a 20% chance
     * of discovering that it has major damage, and 80% chance
     * to see if the damage is minor
     */

    private void diagnoseCar(Car car){
        this.setHoursWorkedConsecutively(this.getHoursWorkedConsecutively()+1);
        Random rand = new Random();
        System.out.println("Worker " + this.getName());
        System.out.println("Is diagnosing car " + car.getLicensePlate());


        int rand_int = rand.nextInt(100);
        if (rand_int < 20){
            car.setCarStatus(CarStatus.SERIOUS_DAMAGE);
            System.out.println("Car " + car.getLicensePlate() + " has major damage");
        }
        else{
            car.setCarStatus(CarStatus.MINOR_DAMAGE);
            System.out.println("Car " + car.getLicensePlate() + " has minor damage");
        }
    }

    /** Car repair
     *
     * @param car the car which we repair
     * This method takes the car as an input, and increments the repair progress
     * on the car, as well as adding an extra hour of work for the workers.
     * Should the necessary repairs be made, the car's owner is called,
     * thus marking it for removal from the shop.
     */

    private void fixCar(Car car, Workshop workshop){
        car.incrementRepairProgress();
        this.setHoursWorkedConsecutively(this.getHoursWorkedConsecutively()+1);
        if(car.getCarStatus().equals(CarStatus.MINOR_DAMAGE)){
            if(workshop.getNrOfMinorParts() > 0) {
                System.out.println("Worker " +this.getName());
                System.out.println("worked on car " + car.getLicensePlate());
                if (car.getRepairProgress() >= Car.minorRepairProgressNeeded) {
                    workshop.setNrOfMinorParts(workshop.getNrOfMinorParts()-1);
                    this.incrementNumberOfInterventions();
                    car.setCarStatus(CarStatus.READY);
                    car.callOwner();
                }
            }
            else{
                this.setHoursWorkedConsecutively(this.getHoursWorkedConsecutively()-1);
                this.setWorking(false);
                car.setWorkedOn(false);
                System.out.println("Insufficient minor parts to work on car " + car.getLicensePlate());
            }
        }
        if(car.getCarStatus().equals(CarStatus.SERIOUS_DAMAGE)){
            if(this.getNumberOfInterventions() > seriousRepairThreshold) {
                if(workshop.getNrOfMajorParts() > 0) {
                    System.out.println("Worker " +this.getName());
                    System.out.println("worked on car " + car.getLicensePlate());
                    if (car.getRepairProgress() >= Car.majorRepairProgressNeeded) {
                        workshop.setNrOfMajorParts(workshop.getNrOfMajorParts()-1);
                        this.incrementNumberOfInterventions();
                        car.setCarStatus(CarStatus.READY);
                        car.callOwner();
                    }
                }
                else{
                    this.setHoursWorkedConsecutively(this.getHoursWorkedConsecutively()-1);
                    this.setWorking(false);
                    car.setWorkedOn(false);
                    System.out.println("Insufficient major parts to work on car " + car.getLicensePlate());
                }
            }
            else{
                System.out.println("Worker "+ this.getName());
                System.out.println("does not have enough experience to work on car "+ car.getLicensePlate());
                this.setHoursWorkedConsecutively(this.getHoursWorkedConsecutively()-1);
                this.setWorking(false);
                car.setWorkedOn(false);
            }
        }
    }

    /**Choosing which action is appropriate for the car
     *
     * @param car the car we work on
     * This method uses some simple logic to decide what to do with
     * the car, depending on its status (If undiagnosed, it will be
     * sent to diagnosis, if damaged, it will be sent to be repaired,
     * and if it is ready, then we exit the method
     *
     */

    void chooseAction(Car car, Workshop workshop){
        this.isWorking = true;
        car.setWorkedOn(true);
        if (this.hoursWorkedConsecutively < 4){
            if (car.getCarStatus() == CarStatus.UNDIAGNOSED){
                diagnoseCar(car);
                return;
            }
            if(car.getCarStatus() == CarStatus.MINOR_DAMAGE || car.getCarStatus() == CarStatus.SERIOUS_DAMAGE){
                fixCar(car, workshop);
                return;
            }
            if(car.getCarStatus() == CarStatus.READY){
                this.isWorking = false;
                car.setWorkedOn(false);
                return;
            }
        }
        else{
            takeBreak();
        }
    }

    /** Generating random workers
     *
     * @param nameFile File used to generate a random worker
     * @param salaryFile File used to generate a random worker
     * @param nameLen length of the name file
     * @param salaryLen length of the salary file
     * @return new Worker, a randomly generated worker
     * @throws FileNotFoundException In case we can not open the files
     * Method used in the GUI, since I added functionality to hire new, randomly generated workers
     */

    public static Worker generateRandomWorker(File nameFile, File salaryFile, Integer nameLen, Integer salaryLen) throws FileNotFoundException {
        int i;
        Random rand = new Random(System.currentTimeMillis());
        int nameAux, salaryAux;
        nameAux = rand.nextInt(nameLen);
        salaryAux = rand.nextInt(salaryLen);
        String name = "uninitialised";
        Integer salary = 0;
        Scanner nameScanner = new Scanner(nameFile).useDelimiter("\\n");
        Scanner salaryScanner = new Scanner(salaryFile);
        for(i = 0 ; i < nameAux; i++){
            name = nameScanner.next();
        }
        for(i = 0; i < salaryAux; i++){
            salary = salaryScanner.nextInt();
        }
        nameScanner.close();
        salaryScanner.close();
        WorkerBuilder workerBuilder = new WorkerBuilder(name, salary);
        Worker worker = workerBuilder.build();
        return worker;
    }

    public static class WorkerBuilder{
        //mandatory
        private String name;
        private Integer salary;
        //optional
        private Integer numberOfInterventions;

        /**Constructor
         *
         * @param name the name of the worker
         * @param salary the salary of the worker
         *
         */

        public WorkerBuilder(String name, Integer salary){
            this.name = name;
            this.salary = salary;
        }

        /**Setter for the number of interventions
         *
         * @param numberOfInterventions the number of interventions the worker has
         * Sets the number of interventions of our worker
         */

        public void setNumberOfInterventions(Integer numberOfInterventions) {
            this.numberOfInterventions = numberOfInterventions;
        }

        /**The build method
         *
         * @return new Worker our worker, which we have built
         * This method turns our WorkerBuilder into an actual Worker
         */

        public Worker build(){
            if (this.numberOfInterventions == null){
                this.numberOfInterventions = 0;
            }
            return new Worker(this);
        }
    }
}
