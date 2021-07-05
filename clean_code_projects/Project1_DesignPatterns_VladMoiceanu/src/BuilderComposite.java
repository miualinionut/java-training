public class BuilderComposite {

    public static void main(String[] args) {
        CarBuilder toyota = new Toyota();
        Engineer engineer = new Engineer(toyota);

        engineer.constructCar();

        Car car = engineer.getCar();

        System.out.println("Builder constructed: " + car);


        ToyotaComposite toyota2 = new ToyotaComposite("Diesel", "Red", "Michelin");
        RenaultComposite renault = new RenaultComposite("Electrical", "Purple", "Pirelli");

        AllCars toyotaCars = new AllCars();
        toyotaCars.addCar(toyota2);

        AllCars renaultCars = new AllCars();
        renaultCars.addCar(renault);

        AllCars cars = new AllCars();
        cars.addCar(toyotaCars);
        cars.addCar(renaultCars);

        cars.showCarDetails();
    }
}
