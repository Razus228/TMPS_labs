package Lab2.Market;

//Builder Method implementation

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

