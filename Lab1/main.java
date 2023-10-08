package Lab1;

import Lab1.MarketSystem.ConcreteMarket;
import Lab1.MarketSystem.ConcreteProduct;
import Lab1.MarketSystem.Market;
import Lab1.MarketSystem.Product;

public class Main {
    public static void main(String[] args) {
        Market market = new ConcreteMarket();

        Product product1 = new ConcreteProduct("Product A", 10.0);
        Product product2 = new ConcreteProduct("Product B", 15.0);

        market.addProduct(product1);
        market.addProduct(product2);

        market.displayProducts();
    }
}
