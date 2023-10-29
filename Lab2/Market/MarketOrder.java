package Lab2.Market;

//Factory Method implementation

public class MarketOrder extends Order {
    public MarketOrder(String symbol, int quantity) {
        super(symbol, quantity);
    }

    @Override
    public void execute() {
        // Execute market order logic
        System.out.println("Executing market order for " + quantity + " shares of " + symbol);
    }
}

