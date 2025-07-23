package strategy.after;

import strategy.after.fly.FlyBehavior;
import strategy.after.quack.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
