package observer.after.observer;

import observer.after.subject.Subject;
import observer.after.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private double pressure;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                "[StatisticsDisplay] temperature: " + temperature + " humidity: " + humidity + " pressure: " + pressure
        );
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
