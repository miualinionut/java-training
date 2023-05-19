package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

// WeatherStation class
class WeatherStation {
    private List<Display> displays = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void addObserver(Display display) {
        displays.add(display);
    }

    public void removeObserver(Display display) {
        displays.remove(display);
    }

    public void updateWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Display display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }
}
