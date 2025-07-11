package factoryMethod;

public class KeyboardCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Keyboard();
    }
}
