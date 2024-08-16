package customer;

public class Order {
  private Item[] items;
  private int checkoutDateTime;

  public Order(Item[] items){
    this.items = items;
  }

  public Item[] getItems(){
    return this.items;
  }
}
