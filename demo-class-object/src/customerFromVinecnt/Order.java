package customerFromVinecnt;

import java.math.BigDecimal;
import java.time.chrono.ThaiBuddhistChronology;

public class Order {
  private Item[] items;
  private String currency;

  public Order(){
    this.items = new Item[0]; // fixed length
  }

  // public Order(Item[] items){
  // this.items = items;
  // }

  // Method Signature: method name + parameter list (number + type)
  public void add(Item item){
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) { // loop old array
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public void remove(int index){ // i.e. length 4 -> length 3
    if (index > this.items.length - 1 && index >= 0)
      return;
    Item[] newItems = new Item[this.items.length - 1];
    int idx = 0;
    for (int i = 0; i < this.items.length; i++) {
      if (i != index){
        newItems[idx++] = this.items[i];
      }
    }
    this.items = newItems;
  }


  public Item[] getItems(){
    return this.items;
  }

  public double totalValue(){
    // double + double -> BigDecimal
    BigDecimal total = new BigDecimal(0.0);
    for (int i = 0; i < this.items.length; i++) {
      total = total.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }
    return total.doubleValue();
  }



}
