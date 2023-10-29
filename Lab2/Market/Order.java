package Lab2.Market;

//Factory Method implementation

public abstract class Order {
    protected String symbol;
    protected int quantity;

    public Order(String symbol, int quantity) {
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public abstract void execute();
}

