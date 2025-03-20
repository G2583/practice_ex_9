import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
     private Queue<String> orderQueue;

    public OrderQueue() {
        orderQueue = new LinkedList<>();
    }

    public void addOrder(String order) {
        orderQueue.add(order);
        System.out.println("Order added to the queue: " + order);
    }

    public String processNextOrder() {
        if (!orderQueue.isEmpty()) {
            String order = orderQueue.poll();
            System.out.println("Processing order: " + order);
            return order;
        } else {
            System.out.println("The order queue is empty.");
            return null;
        }
    }

    public boolean isQueueEmpty() {
        return orderQueue.isEmpty();
    }

    public void displayAllOrders() {
        if (orderQueue.isEmpty()) {
            System.out.println("The order queue is empty.");
        } else {
            System.out.println("Orders in the queue:");
            for (String order : orderQueue) {
                System.out.println(order);
            }
        }
    }
}
