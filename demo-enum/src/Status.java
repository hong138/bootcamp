

public enum Status {
  PAID (1, "Paid"), 
  READY_TO_SHIP(2, "Ready to Ship"), 
  SHIPPING(3, "Shipping"), 
  DELIVERED(4, "Delivered")
  ;
  // atttibute design
  // purpose: easy to find something

  private int value;
  private String display;

  private Status (int value, String display){
    this.value = value;
    this.display = display;
  }

  public int getValue(){
    return this.value;
  }

  public String getDisplay(){
    return this.display;
  }

  public Status get(int value){
    for (Status status : Status.values()){
      if (value == status.value){
        return status;
      }
    }
    return null;
  }

  public Status next(){
    return this.get(this.value + 1);
  }

  public static void main(String[] args) {
    System.out.println(Status.READY_TO_SHIP.getValue());
    System.out.println(Status.SHIPPING.next());
  }
}
