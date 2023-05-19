package clean.code.design_patterns.requirements;


// Main class
public class Main {
    public static void main(String[] args) {
        // Factory Pattern
        Vehicle car = VehicleFactory.createVehicle("car");
//        car.start();
//        car.stop();

        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
//        motorcycle.start();
//        motorcycle.stop();

        // State Pattern
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.AddCarTraffic(car);
        trafficLight.AddCarTraffic(motorcycle);

        trafficLight.printState();

        trafficLight.change();
        trafficLight.printState();

        trafficLight.RemoveCarTraffic(car);

        trafficLight.change();
        trafficLight.printState();

        trafficLight.change();
        trafficLight.printState();
    }
}

