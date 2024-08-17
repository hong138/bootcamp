package customer;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

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

    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formattedDate = sdf.format(date);

    sb.append("Date: ").append(formattedDate).append("\n");

    for (Item item : items) {
    sb.append(String.format("Item: %-"+maxItemNameLength+"s | Quantity: %d | Price per unit: $%.2f\n",
              item.getItemName(), item.getQuantity(), item.getPrice()));
    }

    sb.append("Total Amount: $").append(String.format("%.2f", calculateTotalAmount()));
    return sb.toString();
}
}
