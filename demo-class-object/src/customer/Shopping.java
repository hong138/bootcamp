package customer;

import java.time.LocalDateTime;

public class Shopping {
  public static void main(String[] args) {
    // default
    User customer = new User("Chris", "Wong", 25, 10001, 98765432);
    User[] user1 = new User[]{customer};
    Item cocaCola = new Item("Coca Cola", 1111, 8, 1);
    Item orangeJuice = new Item("Orange Juice", 1112, 4, 1);
    Item[] items = new Item[] {cocaCola, orangeJuice};
    Order order = new Order(items, LocalDateTime.now(), user1);
    System.out.println(order.getOrderDetails());

    User customer2 = new User("Paul", "Choi", 30, 10002, 66554433);
    User[] user2 = new User[]{customer2};
    Item cocaCola2 = new Item("Coca Cola", 1111, 8, 3);
    Item orangeJuice2 = new Item("Orange Juice", 1112, 4, 2);
    Item[] items2 = new Item[] {cocaCola2, orangeJuice2};
    Order order2 = new Order(items2, LocalDateTime.now(), user2);
    System.out.println(order2.getOrderDetails());

  }
}
