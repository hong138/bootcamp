package linkedlistDemo;

public class CustomerLinkedList {
  private Node head;
  private Node tail;

  public CustomerLinkedList (){
    this.head = new Node(null);
  }

  public boolean add(Customer2 customer){

  }

  public static void main(String[] args) {
    CustomerLinkedList customerLinkedList = new CustomerLinkedList();
    customerLinkedList.add(new Customer2("Peter", 25));
  }
}
