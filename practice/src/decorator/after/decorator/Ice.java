package decorator.after.decorator;

import decorator.after.component.Beverage;

public class Ice extends BeverageDecorator {
    public Ice(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + ", Ice";
    }

    public int getCost() {
        return super.getCost() + 0; //얼음은 무료
    }
}
