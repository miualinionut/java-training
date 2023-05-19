package clean.code.design_patterns.requirements;

public class Main {
    public static void main(String[] args) {
        // Create the weather station
        WeatherStation weatherStation = new WeatherStation();

        // Create displays using the factory
        DisplayFactory displayFactory = new DisplayFactory();
        Display lcdDisplay = displayFactory.createDisplay("LCD");
        Display ledDisplay = displayFactory.createDisplay("LED");
        Display tubeDisplay = displayFactory.createDisplay("TUBE");


        // Add displays to the weather station
        weatherStation.addObserver(lcdDisplay);
        weatherStation.addObserver(ledDisplay);
        weatherStation.addObserver(tubeDisplay);

        // Simulate weather data changes
        weatherStation.updateWeatherData(15.6f, 68.0f, 1013.25f, 50f);

        // Remove the LCD
        weatherStation.removeObserver(lcdDisplay);

        // Simulate weather data changes again
        weatherStation.updateWeatherData(37.0f, 39.0f, 1015.0f, 100f);

        // Also remove the LED Display
        weatherStation.removeObserver(ledDisplay);

        // Simulate weather data changes again
        weatherStation.updateWeatherData(12.4f, 55.0f, 1015.0f, 25f);

        // Add the LCD again
        weatherStation.addObserver(lcdDisplay);

        // Simulate weather data changes again
        weatherStation.updateWeatherData(-2.0f, 90.0f, 1015.0f, 10f);

    }
}
