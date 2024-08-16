package customer;

import java.time.LocalDateTime;
import java.util.Date;

public class Shopping {
  public static void main(String[] args) {
    // default
    Item cocaCola = new Item("Coca Cola", 1111, 8, 1);
    Item orangeJuice = new Item("Orange Juice", 1112, 4, 1);
    Item[] items = new Item[] {cocaCola, orangeJuice};
    Order order = new Order(items);
    LocalDateTime currentDateTime = LocalDateTime.now();

    Item cocaCola2 = new Item("Coca Cola", 1111, 8, 3);
    Item orangeJuice2 = new Item("Orange Juice", 1112, 4, 2);
    Item[] items2 = new Item[] {cocaCola2, orangeJuice2};
    Order order2 = new Order(items2);

    LocalDateTime currentDateTime = LocalDateTime.now(); 
    System.out.println(currentDateTime); 

  }
}
