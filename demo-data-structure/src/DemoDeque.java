
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
    System.out.println(strings);
    strings.removeLast();
    System.out.println(strings);
    
  }
}
