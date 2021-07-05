package Observer;

public class StatisticsDisplay implements Observer {
    private double avg;
    private double max;
    private double min;
    private Subject weatherData;

    StatisticsDisplay(Subject weatherData){
        avg = 0;
        max = -99999;
        min = 99999;
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        // Calculating new average
        if(avg == 0)
            avg = 2 * temperature;
        else
            avg += temperature;
        avg /= 2;

        // Update the max
        max = Double.max(max, temperature);

        // Update the min
        min = Double.min(min, temperature);

        // Print the new data
        System.out.println("Avg/Max/Min temperature: " + avg + ", " + max + ", " + min);

    }
}
