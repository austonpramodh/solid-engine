package CustomerOrder;

import java.util.Comparator;

public class CustomerOrder {
  private int orderId;
  private String customerName;
  private double orderAmount;

  public CustomerOrder(int orderId, double orderAmount, String customerName) {
    this.orderId = orderId;
    this.customerName = customerName;
    this.orderAmount = orderAmount;
  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public double getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(double orderAmount) {
    this.orderAmount = orderAmount;
  }
}

class OrderComparator implements Comparator<CustomerOrder> {

  // Overriding compare()method of Comparator
  // for ascending order of orderId
  public int compare(CustomerOrder c1, CustomerOrder c2) {
    if (c1.getOrderId() < c2.getOrderId())
      return -1;
    else if (c1.getOrderId() > c2.getOrderId())
      return 1;
    return 0;
  }
}