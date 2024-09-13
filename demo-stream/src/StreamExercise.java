import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7 , 8, 9, 10);
    numbers = numbers.stream()
              .filter(n -> n % 2 == 0) 
              .map(n -> n * n)
              .sorted((n1, n2) -> n1 > n2 ? -1 : 1)
              .collect(Collectors.toList()); // ArrayList / LinkedList
    System.out.println(numbers); // [100, 64, 36, 16, 4]

    numbers.add(999);
    System.out.println(numbers); // [100, 64, 36, 16, 4, 999]

    // !!! No add & remove, but set is ok
    // Mutable but fixed size
    List<String> strings = Arrays.asList("abc", "def", "ghi", "jkl"); 
    // strings.add("xyz"); // java.lang.UnsupportedOperationException
    strings.set(1, "element"); // OK
    System.out.println(strings); // [abc, element, ghi, jkl]

    // !!! List.of - Java 9 (No add, remove, set)
    // Immutable but fixed size
    List<String> strings2 = List.of("abc", "def", "ghi", "jkl");
    // strings2.add("xyz"); // java.lang.UnsupportedOperationException
    // strings2.set(1, "hello"); // java.lang.UnsupportedOperationException

    strings2 = List.of(null, "def", "ghi", "jkl"); // java.lang.NullPointerException

    }
}
