package clean.code.design_patterns.requirements;

// Display interface
interface Display {
    void update(float temperature, float humidity, float pressure, float light);

    String getType();
}

// Concrete displays
class LCD implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure, float light) {
        // Update LCD with weather data
        System.out.println("Updated a LCD display successfully");
    }

    @Override
    public String getType() {
        return "LCD";
    }
}

class LED implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure, float light) {
        // Update LED display with weather data
        System.out.println("Updated a LED display successfully");
    }

    @Override
    public String getType() {
        return "LED";
    }
}

class TUBE implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure, float light) {
        // Update TUBE display with weather data
        System.out.println("Updated a TUBE display successfully");
    }

    @Override
    public String getType() {
        return "TUBE";
    }
}

// Display factory
class DisplayFactory {
    public Display createDisplay(String type) {
        if (type.equalsIgnoreCase("LCD")) {
            return new LCD();
        } else if (type.equalsIgnoreCase("led")) {//played a bit with the case of the letters
            return new LED();
        } else if (type.equalsIgnoreCase("TUBE")) {
            return new TUBE();
        }
        throw new IllegalArgumentException("Invalid display type.");
    }
}
