package decorator.after.decorator;

import decorator.after.component.Beverage;

public class ExtraShot extends BeverageDecorator {
    public ExtraShot(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + ", ExtraShot";
    }

    public int cost() {
        return super.getCost() + 700;
    }
}
