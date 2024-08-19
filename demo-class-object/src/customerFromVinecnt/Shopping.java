package customerFromVinecnt;

public class Shopping {
  public static void main(String[] args) {
    // Create User
    // Create Order
    // Create Item

    Item apple = new Item(10.9, 4);
    Item orange = new Item(13.2, 7);

    Order order = new Order();
    order.add(apple);
    order.add(orange);

    User user = new User();
    user.add(order);

    System.out.println(user.totalTransactionAmount());










  }
}
