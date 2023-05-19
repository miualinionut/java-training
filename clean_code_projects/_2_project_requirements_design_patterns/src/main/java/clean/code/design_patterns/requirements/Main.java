package clean.code.design_patterns.requirements;

public class Main {
    public static void main(String[] args) {
        // Create the weather station
        WeatherStation weatherStation = new WeatherStation();

        // Create displays using the factory
        DisplayFactory displayFactory = new DisplayFactory();
        Display lcdDisplay = displayFactory.createDisplay("LCD");
        Display ledDisplay = displayFactory.createDisplay("LED");

        // Add displays to the weather station
        weatherStation.addObserver(lcdDisplay);
        weatherStation.addObserver(ledDisplay);

        // Simulate weather data changes
        weatherStation.updateWeatherData(25.5f, 60.0f, 1013.25f);

        // Remove the LCD display
        weatherStation.removeObserver(lcdDisplay);

        // Simulate weather data changes again
        weatherStation.updateWeatherData(26.0f, 55.0f, 1015.0f);


    }
}
