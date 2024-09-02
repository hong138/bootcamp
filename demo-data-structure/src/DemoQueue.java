import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // LinkedList (Queue vs Deque vs List)
    Queue<String> queue = new LinkedList<>();
    queue.add("abc"); // Collection method
    queue.add("def"); // Collection method
    queue.add("ghi"); // Collection method
    System.out.println(queue.size()); // Collection method

    String removedString = queue.remove(); // default removed head
    System.out.println(queue); // [def, ghi]
    System.out.println(removedString); // abc

    queue.remove("ghi");
    System.out.println(queue); // [def] (for loop)

    // LinkedList object determined add() -> addLast()
    // ArrayDeque object determined add() -> addLast()
  }
}
