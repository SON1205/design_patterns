package observer.after.observer;

import observer.after.subject.Subject;
import observer.after.subject.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Subject s) {
        if (s instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) s;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("[CurrentConditionsDisplay] temperature: " + temperature + " humidity: " + humidity);
    }
}
