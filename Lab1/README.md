# **Author : Igor Mihailiuc**

# Topic : *SOLID Principles*

## Objectives:
1. Study and understand SOLID principles;
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
3. Create a sample project that respects SOLID Principles.

# Implementation

- For this laboratory work, I've implemented a example of Market, that will list all the products that it has. It's just the start of the whole new program, so for the start it will seem that it's too primitive. Let's start with the implementation of the principles:
  
1. Single Responsibility:
   
```
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
```

2. Open/Closed Principle
```
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
```

3. Liskov Substitution Principle:
```
    Product product1 = new ConcreteProduct("Product A", 10.0);
    Product product2 = new ConcreteProduct("Product B", 15.0);
    Product newProduct = new NewProduct("New Product", 20.0);
```

4. Interface Segregation Principle:
```
We have two interfaces Product and Market. This adheres to ISP, as clients can choose to use only what they need
```

5. Dependency Inversion Principle:
```
package Lab1.MarketSystem;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMarket implements MarketService {
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
```

## Conclusion
 In conclusion, I want to say that, for this laboratory work I've refreshed my thoughts abotu SOLID pricniples and especially Java language and its syntax. As seend above, I've implemented all principles that were needed. I know I was late for submission, but please don't punish me very hard :).