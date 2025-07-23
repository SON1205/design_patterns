package strategy;

import strategy.after.Duck;
import strategy.after.MallardDuck;
import strategy.after.fly.FlyNoWay;
import strategy.after.quack.Quack;
import strategy.after.quack.Squeak;

public class StrategyMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyNoWay(), new Quack());
//        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performQuack();
    }
}
