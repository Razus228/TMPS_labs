package Lab2.Market;

//Factory Method implementation

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

