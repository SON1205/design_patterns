package factoryMethod;

public class Printer implements Product {
    @Override
    public void use() {
        System.out.println("Printing a document...");
    }
}
