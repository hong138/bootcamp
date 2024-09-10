
import java.util.LinkedList;

public class LinkedList1<T> {
  private Node head;
  private Node last;

  public void add(T value);

  private class Node{
    private T value;
    private Node<T> next;
  }

  public static void main(String[] args) {
    LinkedList1<String> strings = new LinkedList1<>();
    strings.add("abc");
  }
}
