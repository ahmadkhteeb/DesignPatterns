package Observer;

public class CurrentConditionsDisplay implements Observer {

    private double temperature;
    private double humidity;
    private Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        // Print the new data
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
