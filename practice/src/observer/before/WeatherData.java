package observer.before;

public class WeatherData {
    private double temperature;
    private double humidity;
    private double pressure;

    // 직접 참조: 결합도 높음
    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;

    public WeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        currentConditionDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
    }
}
