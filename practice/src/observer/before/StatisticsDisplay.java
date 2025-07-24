package observer.before;

public class StatisticsDisplay {
    private double temperature;
    private double humidity;
    private double pressure;

    public StatisticsDisplay(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }


    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println(
                "[StatisticsDisplay] temperature: " + temperature + ", humidity: " + humidity + ", pressure: "
                        + pressure
        );
    }
}
