package observer.before;

public class CurrentConditionDisplay {
    private double temperature;
    private double humidity;

    public CurrentConditionDisplay(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("[Current Condition Display] temperature: " + temperature + " humidity: " + humidity);
    }
}
