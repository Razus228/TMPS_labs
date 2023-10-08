package Lab1.MarketSystem;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMarket implements Market {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void displayProducts() {
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}

