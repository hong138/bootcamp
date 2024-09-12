
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaExercise {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7 , 8, 9, 10);
    List<Integer> squareNumbers = numbers.stream()
                                  .filter(n -> n % 2 == 0)
                                  .map(n -> n * n)
                                  .sorted((a, b) -> b - a)
                                  .collect(Collectors.toList());
    System.out.println(squareNumbers);
    
    // 2. Filtering and Collecting
    List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex"); 
    List<String> filterA = names.stream()
                           .filter(n -> n.startsWith("A"))
                           .collect(Collectors.toList());
    System.out.println(filterA);

    // 3. Finding Maximum and Minimum
    List<Integer> numbers3 = Arrays.asList(10, 20, 5, 30, 15);
    int max = numbers3.stream().mapToInt(numbers3.max().getAsInt());
    int min = numbers3.stream().mapToInt(numbers3.min().getAsInt());


    // 4. Mapping to a List of Lengths


    // 5. Counting Elements


    // 6. Filtering and Collecting to a Set


    // 7. Mapping to a Map (Key-Value Pairs)


    // 8. Filtering and Mapping to a List of Objects


    // 9. Grouping and Collecting to a Map (Group by Age)


    // 10. Partitioning and Collecting to a Map (Partition by Gender)


    // 11. Filtering, Mapping, and Collecting to a LinkedHashSet


    // 12. Mapping to a Custom Object and Collecting to a List


    // 13. Mapping and Collecting to a Deque


    // 14. Transforming and Collecting to a Array


    // 15. Map and Reduce


    // 16. Grouping


    // 17. Parallel Streams


    // 18. FlatMap


    // 19. Distinct and Sorting


    // 20. Partitioning By


    // 21. Joining Strings


    // 22. Find First and Any


    // 23. Limit and Skip


    // 24. Peek (Debugging in Streams)


    // 25. Optional and Streams


    // 26. Custom Collector


    // 27. Using Stream to Manipulate Arrays


    // 28. Stirng Length Calculation

    
  }
}
