package strategy.before1;

public class RedheadDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("MallardDuck quack");
    }

    @Override
    public void swim() {
        System.out.println("MallardDuck swim");
    }

    @Override
    public void display() {
        System.out.println("MallardDuck display");
    }
}
