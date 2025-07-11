package factoryMethod;

public class Keyboard implements Product {
    @Override
    public void use() {
        System.out.println("Typing on a keyboard...");
    }
}
