package factoryMethod;

public abstract class Creator {
    public void usePeripheral() {
        Product peripheral = createProduct();
        peripheral.use();
    }

    // Factory Method
    public abstract Product createProduct();
}
