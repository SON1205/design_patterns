package factoryMethod;

public class FactoryMethodPrac {
    public static void main(String[] args) {
        Creator keyboardCreator = new KeyboardCreator();
        keyboardCreator.usePeripheral();

        Creator mouseCreator = new MouseCreator();
        mouseCreator.usePeripheral();

        Creator printerCreator = new PrinterCreator();
        printerCreator.usePeripheral();
    }
}
