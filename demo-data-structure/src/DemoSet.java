
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class DemoSet {
  public static void main(String[] args) {
    // Collection.class -> Basic operation of collection 
    Collection<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("def");
    System.out.println(strings); // [abc, def]

    // 
    strings = new HashSet<>();
    strings.add("hij");
    strings.remove("hij");
    System.out.println(strings.size()); // 0

    // Why do we need HashSet
    strings.add("xyz");
    boolean isAdded = strings.add(new String("xyz"));
    System.out.println(isAdded); // false, HashSet avoid duplicated value
    System.out.println(strings.size()); // 1
    strings.add("xyz2");
    System.out.println(strings.size()); // 2

    // strings.add() ->
    strings.clear(); // after clear, it is still HashSet object
    strings = new ArrayList<>();
    strings.add("abc");
    strings.add("abc");
    System.out.println(strings.size()); // 2

    // ArrayList vs HashSet
    // Same:
    // 1. HashSet has NO ordering
    // 2. Add/ remove -> array -> recreate array object

    // Different:
    // 1. Polymorphism -> different implementation -> add() -> return false if duplicated
    // 2. Searching by hash code to find out duplicated
  }
}
