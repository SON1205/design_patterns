package factoryMethod;

public class MouseCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Mouse();
    }
}
