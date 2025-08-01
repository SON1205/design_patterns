package decorator.after.component;

public class Chocolate implements Beverage {
    @Override
    public String getDescription() {
        return "Chocolate";
    }

    @Override
    public int getCost() {
        return 4000;
    }
}
