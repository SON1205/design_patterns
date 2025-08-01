package decorator.after.decorator;

import decorator.after.component.Beverage;

public class Whip extends BeverageDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + ", Whip";
    }

    public int cost() {
        return super.getCost() + 500;
    }
}
