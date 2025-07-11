package factoryMethod;

public class PrinterCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Printer();
    }
}
