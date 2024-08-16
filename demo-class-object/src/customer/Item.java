package customer;

public class Item {
  private String itemName;
  private int itemId;
  private double price;
  private int quantity;

  // constructor
  // 
  public Item(){
    this.quantity = 1;
  }

  public Item (String itemName, int itemId, double price, int quantity){
    this.itemName = itemName;
    this.itemId = itemId;
    this.price = price;
    this.quantity = quantity;
  }

  // setter
  public void setItemName(String itemName){
    this.itemName = itemName;
  }

  public void setItemId(int itemId){
    this.itemId = itemId;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  
  
  // getter
  public String getItemName(){
    return this.itemName;
  }

  public int getItemId(){
    return this.itemId;
  }

  public double getTotalAmount(){
    return this.price * this.quantity;
  }

}