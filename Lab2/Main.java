package Lab2;

import Lab2.Market.Order;
import Lab2.Market.OrderBook;
import Lab2.Market.OrderBuilder;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        OrderBook orderBook = OrderBook.getInstance();

        // Factory Method Pattern
        OrderBuilder orderBuilder = new OrderBuilder();
        Order marketOrder = orderBuilder.setSymbol("AAPL").setQuantity(100).buildMarketOrder();
        Order limitOrder = orderBuilder.setSymbol("GOOGL").setQuantity(50).setPrice(2500.0).buildLimitOrder();

        // Add orders to the order book
        orderBook.addOrder(marketOrder);
        orderBook.addOrder(limitOrder);
        
        
        // Execute orders from the order book
        orderBook.executeOrders();
    }
}
