package decorator.after.component;

public class Americano implements Beverage {
    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public int getCost() {
        return 2000;
    }
}
