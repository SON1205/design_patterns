package command;

public class Light {
    boolean on;
    String place;

    public Light() {
        on = false;
    }

    public Light(String place) {
        on = false;
        this.place = place;
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public String getPlace() {
        return place;
    }
}
