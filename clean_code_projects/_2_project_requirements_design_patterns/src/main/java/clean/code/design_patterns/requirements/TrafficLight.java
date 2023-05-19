package clean.code.design_patterns.requirements;


// State Pattern
// Context class
class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedState();
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
    }

    public void printState() {
        System.out.println("Yellow Light");
    }
}
