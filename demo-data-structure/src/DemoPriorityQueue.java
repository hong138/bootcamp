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

    // Custom order
    // Tips: Class for sorting (Comparator)
    Queue<String> pq2 = new PriorityQueue<>(new StringDesc());
    pq2.add("John");
    pq2.add("Peter");
    System.out.println(pq2); // [Peter, John]
    pq2.add("Kenny");
    pq2.add("Billy");
    System.out.println(pq2); // [Peter, John, Kenny, Billy]

    // Person.class (name, age), isElderly()
    // PriorityQueue, Elderly always goes first.

    Queue<Person> person = new PriorityQueue<>();
    person.add(new Person("John", 65));
    person.add(new Person("Mary", 60));
    person.add(new Person("Tony", 70));
    person.add(new Person("Alan", 62));
    person.add(new Person("Peter", 68));
    person.add(new Person("Andy", 55));
    person.add(new Person("Annie", 20));

    System.out.println(person); // [Tony (70), Peter (68), John (65), Mary (60), Alan (62), Andy (55), Annie (20)]

    

  }
}
