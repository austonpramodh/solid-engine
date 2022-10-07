package CustomerOrder;

import java.util.PriorityQueue;

public class OrderQueue {
  public static void main(String[] args) {
    // Create a priority queue of CustomerOrder objects with orderID as the priority
    PriorityQueue<CustomerOrder> orderQueue = new PriorityQueue<CustomerOrder>(3, new OrderComparator());

    // Add CustomerOrder objects to the queue
    CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
    CustomerOrder c2 = new CustomerOrder(3, 50.5, "customer3");
    CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");

    orderQueue.add(c1);
    orderQueue.add(c2);
    orderQueue.add(c3);

    // Print the queue as you pop the elements
    while (orderQueue.size() > 0) {
      CustomerOrder c = orderQueue.poll();
      System.out.println("Order ID: " + c.getOrderId() + ", Order Amount: "
          + c.getOrderAmount() + ", Customer Name: " + c.getCustomerName());
    }
  }
}
