# **Author : Igor Mihailiuc**

# Topic : *SOLID Principles*

## Objectives:
1. Study and understand the Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
3. Use some creational design patterns for object instantiation in a sample project.

# Implementation

- For this laboratory work, I've implemented a example of Market, that will list all the products that it has. I've decided to implement ***Singleton pattern***, ***Builder pattern*** and the ***Factory pattern***. Here are some examples:

1. ***Singleton pattern*** :
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
```
public class OrderBook {
    private static OrderBook instance;
    private List<Order> orders;

    private OrderBook() {
        this.orders = new ArrayList<>();
    }

    public static OrderBook getInstance() {
        if (instance == null) {
            instance = new OrderBook();
        }
        return instance;
    }
    ...
}
```

2. ***Factory pattern*** :
The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
```
public abstract class Order {
    protected String symbol;
    protected int quantity;

    public Order(String symbol, int quantity) {
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public abstract void execute();
}
```
```
public class LimitOrder extends Order {
    private double price;

    public LimitOrder(String symbol, int quantity, double price) {
        super(symbol, quantity);
        this.price = price;
    }

    @Override
    public void execute() {
        // Execute limit order logic
        System.out.println("Executing limit order for " + quantity + " shares of " + symbol + " at $" + price);
    }
}
```

3. ***Builder pattern*** : 
Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.

```
public class OrderBuilder {
    private String symbol;
    private int quantity;
    private double price;

    public OrderBuilder setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public OrderBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Order buildMarketOrder() {
        return new MarketOrder(symbol, quantity);
    }

    public Order buildLimitOrder() {
        return new LimitOrder(symbol, quantity, price);
    }
}
```

# Conclusion

In conclusion I want to say that this laboratory wokr made me capable of implementing some new important stuff like the creational design patterns, and that those help us write a cleaner code and easier to understand.