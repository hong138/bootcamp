package linkedlistDemo;

import java.util.LinkedList;

public class Box {
  private Box next;
  private int value;

  public Box(){}

  public Box(int value){
    this.value = value;
  }

  public Box(int value, Box next){
    this.value = value;
    this.next = next;
  }

  public Box getNext(){
    return this.next;
  }

  public int getValue(){
    return this.value;
  }

  // instance method
  // return this.arr[index];
  public int get(int index){
    int count = 0;
    Box head = this.next;
    while (head != null){
      if(++count > index){
        return this.value;
      }
      head = head.next;
    }
    return -1;
  }

  public Box getTail(){
    Box head = this;
    while (head.next != null){
      head = head.next;
    }
    return head;
  }

  public String toString(){
    Box head = this;
    StringBuilder sb = new StringBuilder("");
    while (head != null){
      sb.append(head.getValue());
      head = head.next;
      sb.append(",");
    }
    return sb.append(")").toString();
  }


  public static void main(String[] args) {
    // 3 ways to store a list of value of same type
    // 3, 7, 10 -> 1. array 2. arrayLisy 3. LinkedList

    // Explaination of Linked List
    Box stringList = new Box(3, new Box(7, new Box(10)));
    
    // get the first element
    System.out.println(stringList.getValue());
    // get the second element
    System.out.println(stringList.getNext().getValue());
    // get the third element
    System.out.println(stringList.getNext().getNext().getValue());

    // 0(1) -> Constant time -> add element at head
    // Add new element at head position
    stringList = new Box(100, stringList);
    System.out.println(stringList.getValue());

    // 0(1) -> Constant time -> add element at tail
    // Add new element at tail position
    Box tail = stringList.getTail(); // !!! LinkedList.class store the tail address as an attribute
    tail.next = new Box(200);
    System.out.println(stringList.getValue());


    LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
    integerLinkedList.add(3);
    integerLinkedList.add(7);
    integerLinkedList.add(10);
    System.out.println(integerLinkedList);
  }
}
