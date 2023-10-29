package Lab1;

import Lab1.MarketSystem.ConcreteMarket;
import Lab1.MarketSystem.ConcreteProduct;
import Lab1.MarketSystem.Market; 
import Lab1.MarketSystem.Product;
import Lab1.MarketSystem.NewProduct;
import Lab1.MarketSystem.MarketService;

public class Main {
    public static void main(String[] args) {
        MarketService marketservice = new ConcreteMarket();

        Product product1 = new ConcreteProduct("Product A", 10.0);
        Product product2 = new ConcreteProduct("Product B", 15.0);
        Product newProduct = new NewProduct("New Product", 20.0);

        marketservice.addProduct(product1);
        marketservice.addProduct(product2);
        marketservice.addProduct(newProduct);

        marketservice.displayProducts();
    }
}
