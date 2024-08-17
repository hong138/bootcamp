package customer;

import java.time.LocalDateTime;

public class Order {
  private Item[] items;
  private LocalDateTime checkoutDateTime;

  public Order(Item[] items, LocalDateTime checkoutDateTime){
    this.items = items;
    this.checkoutDateTime = LocalDateTime.now();
  }

  public Item[] getItems(){
    return this.items;
  }

  public double calculateTotalAmount(){
    double totalAmount = 0;
    for (Item item: items){
      totalAmount += item.getTotalAmount();
    }
    return totalAmount;
  }

  public String getOrderDetails() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order Details:\n");
    int maxItemNameLength = 0;
    for (Item item : items) {
        if (item.getItemName().length() > maxItemNameLength) {
            maxItemNameLength = item.getItemName().length();
        }
    }

    for (Item item : items) {
    sb.append(String.format("Item: %-"+maxItemNameLength+"s | Quantity: %d | Price per unit: $%.2f\n",
              item.getItemName(), item.getQuantity(), item.getPrice()));
    }

    sb.append("Total Amount: $").append(String.format("%.2f", calculateTotalAmount()));
    return sb.toString();
}
}
