package decorator.after.component;

public class Latte implements Beverage {

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public int getCost() {
        return 3500;
    }
}
