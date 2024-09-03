import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // LinkedList (Queue vs Deque vs List)
    Queue<String> queue = new LinkedList<>();
    // 10000 lines ....
    queue.add("abc"); // Collection method
    queue.add("def"); // Collection method
    queue.add("ijk"); // Collection method

    // queue.addFirst("sss0")
    // Queue has addLast & removeFirst ONLY

    System.out.println(queue.size()); // 3, Collection method

    String removedString = queue.remove(); // remove head element
    System.out.println(queue); // [def, ijk]
    System.out.println(removedString); // abc

    queue.remove("ijk"); // [def] (for loop)
    System.out.println(queue);

    // LinkedList object determined add() -> addLast()
    // ArrayDeque object determined add() -> addLast()

    // You may use "instanceOf" for checking
    // Usually we check the same type of instance before downcast
    // i.e if (queue instanceOf Deque){}

    //
    Deque<String> deque = (Deque) queue;
    deque.addFirst("jjj");

    Deque<String> deque2 = new ArrayDeque<>();
    Queue<String> queue2 = new ArrayDeque<>();

    String head = queue.poll(); // similar to "remove"
    System.out.println(head); // jjj
    System.out.println(queue); // [def]

    String head2 = queue.peek(); // look up the head element
    System.out.println(head2); // def
    System.out.println(queue); // [def]

    
    // While Loop
    queue.add("Peter");
    queue.add("Paul");
    queue.add("Mary");
    System.out.println(queue.size());

    // look up the queue (likely you won't loop the queue element)
    // instead, you may consider using List if you treat it as a simple data collection
    for (String s : queue){
      System.out.println(s);
    }

    System.out.println(queue.contains("Peter")); // true
    System.out.println(queue.contains("Vincent")); // false
    System.out.println("----------");

    // Testing    
    String element;
    int count = 0;
    while (true) { 
      element = queue.poll();
      queue.add(element);
      System.out.println(queue.size());
      if (++count > 5) break;
    }
    System.out.println(queue);
    System.out.println("----------");

    // For-Each - consumption

    while (!queue.isEmpty()){
      element = queue.poll();
      System.out.println(element);
    }
    System.out.println(queue);
    System.out.println("----------");



    // As a Developer, you can choose the Interface and the implementation separately
    // 1. Queue -> LinkedList or ArrayList
    // 2. Deque -> LinkedList or ArrayList
    // 3. List -> LinkedList or ArrayList

    // Choose between Queue, Deque, List
    // 1. All the above have ordering
    // 2. Queue/Deque cannot access the middle element DIRECTLY
    // 3. Deque has AddFirst & removeList
    // 4. Queue/Deque for consumption
  }
}
