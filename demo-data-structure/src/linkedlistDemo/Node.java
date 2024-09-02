package linkedlistDemo;

  // similar to Box
  // List(Customer)
  // Customer.class -> name, age

public class Node{
  private Node next;
  private Customer2 customer;

  public Node(Customer2 customer){
    this.customer = customer;
  }

  public Node(Node next,Customer2 customer){
    this.next = next;
    this.customer = customer;
  }

  public Node getNext(){
    return this.next;
  }

  public Customer2 getCustomer(){
    return this.customer;
  }

  public int get(int index){
    int count = 0;
    Node head = this.next;
    while (head != null){
      if(++count > index){
        return this.value;
      }
      head = head.next;
    }
    return -1;
  }

  public Node getTail(){
    Node head = this;
    while (head.next != null){
      head = head.next;
    }
    return head;
  }

  public String toString(){
    Node head = this;
    StringBuilder sb = new StringBuilder("Customers[");
    while (head != null){
      sb.append(head.getCustomer());
      head = head.next;
      sb.append(",");
    }
    return sb.deleteCharAt(sb.length() - 1).append("]").toString();
  }

  public static void main(String[] args) {
  Node customer = new Node(new Customer2("Peter", 30));
  System.out.println(customer);
  }
}
