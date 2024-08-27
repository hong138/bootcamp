public class Order {
  private Item[] items;
  private Status status; // PAID, READY_TO_SHIP, SHIPPING, DELIVERED
  // ...

  // constructor
  public Order(){
    this.items = new Item[0];
  }

  // Bad design, just for testing
  public Order(Item[] items){
    this.items = items;
  }

  public void nextStatus(){
    this.status = this.status.next();
  }

  public void setStatus(Status status){
    this.status = status;
  }

  public Status getStatus(){
    return this.status;
  }

  public static void main(String[] args) {
    Order order = new Order();

    order.setStatus(Status.PAID);
    System.out.println(order.getStatus());

    order.nextStatus();
    System.out.println(order.getStatus()); // void
  }

}
