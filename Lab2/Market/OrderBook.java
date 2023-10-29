package Lab2.Market;

//Singleton implementation

import java.util.ArrayList;
import java.util.List;

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

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order added to the order book: " + order.symbol + " - " + order.quantity);
    }

    public void executeOrders() {
        for (Order order : orders) {
            order.execute();
        }
    }
}
