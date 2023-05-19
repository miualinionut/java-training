package clean.code.design_patterns.requirements;

// Display interface
interface Display {
    void update(float temperature, float humidity, float pressure);
}

// Concrete displays
class LCD implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        // Update LCD display with weather data
    }
}

class LED implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        // Update LED display with weather data
    }
}

// Display factory
class DisplayFactory {
    public Display createDisplay(String type) {
        if (type.equalsIgnoreCase("LCD")) {
            return new LCD();
        } else if (type.equalsIgnoreCase("LED")) {
            return new LED();
        }
        throw new IllegalArgumentException("Invalid display type.");
    }
}
