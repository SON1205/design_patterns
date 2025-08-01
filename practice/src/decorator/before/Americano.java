package decorator.before;

public class Americano extends Beverage {
    @Override
    public String getDescription() {
        return "아메리카노";
    }

    @Override
    public int cost() {
        return 2000;
    }
}
