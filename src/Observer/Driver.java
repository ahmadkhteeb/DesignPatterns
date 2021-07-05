package Observer;

public class Driver {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setData(80, 50, 60);
        System.out.println("-------------------------------------------------------------");
        weatherData.setData(60, 40, 110);
        System.out.println("-------------------------------------------------------------");
        weatherData.setData(85, 70, 40);
        System.out.println("-------------------------------------------------------------");
        weatherData.setData(88, 58, 63);
    }
}
