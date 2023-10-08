package Lab1.MarketSystem;

public class NewProduct implements Product {
    private String name;
    private double price;

    public NewProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}