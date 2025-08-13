package command.complex;

public class Stereo {
    boolean on;
    String cd;
    String radio;
    String dvd;
    int volume;
    String place;

    public Stereo(String place) {
        on = false;
        this.place = place;
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void setCD() {
        cd = "Stereo with CD";
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
