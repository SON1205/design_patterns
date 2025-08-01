package decorator.after.decorator;

import decorator.after.component.Beverage;

public class SoyMilk extends BeverageDecorator {
    public SoyMilk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + ", SoyMilk";
    }

    public int getCost() {
        return super.getCost() + 400;
    }
}
