package decorator.after.decorator;

import decorator.after.component.Beverage;

public class Syrup extends BeverageDecorator {
    public Syrup(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + ", Syrup";
    }

    public double cost() {
        return super.getCost() + 300;
    }
}
