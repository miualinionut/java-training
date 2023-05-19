package clean.code.design_patterns.requirements;
import java.util.List;
import java.util.ArrayList;

// State Pattern
// Context class
class TrafficLight {
    public List<Vehicle> vehicule = new ArrayList<>();
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedState();
    }

    public void AddCarTraffic(Vehicle new_vehicle){
        vehicule.add(new_vehicle);
    }

    public void RemoveCarTraffic(Vehicle new_vehicle){
        vehicule.remove(new_vehicle);
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }

    public void printState() {
        state.printState();
    }
}

// State interface
interface TrafficLightState {
    void change(TrafficLight light);
    void printState();
}

// Concrete States
class RedState implements TrafficLightState {
    public void change(TrafficLight light) {
        System.out.println("Changing light from red to green");
        light.setState(new GreenState());

        for (Vehicle vehicle : light.vehicule){
            vehicle.start();
        }
    }

    public void printState() {
        System.out.println("Red Light");
    }
}

class GreenState implements TrafficLightState {
    public void change(TrafficLight light) {
        System.out.println("Changing light from green to yellow");
        light.setState(new YellowState());
    }

    public void printState() {
        System.out.println("Green Light");
    }
}

class YellowState implements TrafficLightState {
    public void change(TrafficLight light) {
        System.out.println("Changing light from yellow to red");
        light.setState(new RedState());

        for (Vehicle vehicle : light.vehicule){
            vehicle.stop();
        }
    }

    public void printState() {
        System.out.println("Yellow Light");
    }
}
