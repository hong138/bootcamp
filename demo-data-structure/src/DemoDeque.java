
import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("def");
    strings.add("ghi"); // addLast()

    strings.addLast("aaa");
    strings.addFirst("bbb");
    System.out.println(strings); // [bbb, abc, def, ghi, aaa]

    strings.remove(); // remove head
    System.out.println(strings); // [abc, def, ghi, aaa]
    strings.removeFirst();
    System.out.println(strings); // [def, ghi, aaa]
    strings.removeLast();
    System.out.println(strings); // [def, ghi]
    
    String result = strings.pop(); // return and remove the head element
    System.out.println(result); // def
    System.out.println(strings); // [ghi]

    strings.push("hello"); // add element at the head
    System.out.println(strings);

    // pop(), push(), addFirst(), remove(), removeFirst() -> head element
    // add(), addLast(), removeLast() -> tail element

    System.out.println(strings.peek()); // hello // return ONLY
    System.out.println(strings.peekFirst()); // hello, return head element
    System.out.println(strings.peekLast()); // ghi, return tail element

    System.out.println(strings.poll()); // hello
    System.out.println(strings); // [ghi]
    strings.add("goodbye");
    System.out.println(strings); // [ghi, goodbye]

  }
}
