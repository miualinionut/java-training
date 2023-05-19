package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

// WeatherStation class
class WeatherStation {
    private List<Display> displays = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;
    private float light;

    public void addObserver(Display display) {
        displays.add(display);
        System.out.println("Just added :) an Observer for the " + display.getType() + " display");
        System.out.println();
    }

    public void removeObserver(Display display) {
        displays.remove(display);
        System.out.println("Just removed :( an Observer for the " + display.getType() + " display");
        System.out.println();
    }

    public void updateWeatherData(float temperature, float humidity, float pressure, float light) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.light = light;
        recognizeSeason();
        notifyObservers();
        System.out.println();
    }

    private void notifyObservers() {
        for (Display display : displays) {
            display.update(temperature, humidity, pressure, light);
        }
    }

    private void recognizeSeason() {
        if (temperature < 5f)
            System.out.println("Winter is coming");
        else if (temperature < 18f) {
            if (light < 44f)
                System.out.println("It's Autumn");
            else
                System.out.println("Sprrrrrring");
        } else //the remaining season is Sumer
            System.out.println("When I met you in the summer! To my heartbeat's sound!");
    }
}
