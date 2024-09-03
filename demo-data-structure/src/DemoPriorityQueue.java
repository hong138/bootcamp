import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    // toString -> No ordering
    // For PQ, it is NOT first come first serve.
    Queue<String> pq = new PriorityQueue<>(); // natural ordering of the elements
    pq.add("abc");
    pq.add("def");
    System.out.println(pq); // [abc, def]
    pq.add("xyz");
    pq.add("hello");
    System.out.println(pq); // [abc, def, xyz, hello] -> it is not the queue order

    for (String s : pq){
      System.out.println(s);
    }
    System.out.println("----------");

    // !!! The algorithm pick the first element at poll(), but not exactly a sorting.
    // but ... the actual ordering of this queue is ...
    System.out.println(pq.poll()); // abc
    System.out.println(pq.poll()); // def

    // Not yet sort completely
    System.out.println(pq); // 
    System.out.println(pq.poll()); // hello
    System.out.println(pq.poll()); // xyz
  }
}
