package clean.code.design_patterns.requirements;

// Factory Pattern
// Product interface
interface Vehicle {
    void start();
    void stop();
}

// Concrete Products
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle started");
    }

    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

// Factory class
class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}

