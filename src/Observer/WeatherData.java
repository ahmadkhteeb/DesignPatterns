package Observer;

public class WeatherData extends Subject {

    // Weather measurments
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    void notifyObservers() {
        // Update all observers in thr list
        for(Observer o : observersList){
            o.update(temperature, humidity, pressure);
        }
    }

    void setData(float temperature, float humidity, float pressure){
        // Set the weather data
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // Notify observers when the data changes
        notifyObservers();
    }
}
