
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
    System.out.println(squareNumbers);  // [100, 64, 36, 16, 4]
    
    // 2. Filtering and Collecting
    List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex"); 
    List<String> filterA = names.stream()
                           .filter(n -> n.startsWith("A"))
                           .collect(Collectors.toList());
    System.out.println(filterA);  // [Alice, Annie, Alex]

    // 3. Finding Maximum and Minimum
    List<Integer> numbers3 = Arrays.asList(10, 20, 5, 30, 15);
    int max = numbers3.stream().mapToInt(Integer::intValue).max().getAsInt();
    int min = numbers3.stream().mapToInt(Integer::intValue).min().getAsInt();
    System.out.println("max=" + max + ", min=" + min); // max=30, min=5

    // 4. Mapping to a List of Lengths
    List<String> words = Arrays.asList("apple", "banana","pear");
    List<Integer> wordsLength = words.stream().map(s -> s.length()).collect(Collectors.toList());
    System.out.println(wordsLength); // [5, 6, 4]

    // 5. Counting Elements
    List<String> words5 = Arrays.asList("hi", "hello","world","java","stream");
    long greaterThanThree = words5.stream().filter(c -> c.length() > 3).count();
    System.out.println(greaterThanThree); // 4

    // 6. Filtering and Collecting to a Set
    List<Integer> numbers6 = Arrays.asList(5, 10, 15, 20, 10, 5);
    Set<Integer> greaterThanTen = numbers6.stream().filter(c -> c > 10).collect(Collectors.toSet());
    System.out.println(greaterThanTen); // [20, 15]

    // 7. Mapping to a Map (Key-Value Pairs)
    List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
    Map<String, Integer> studentMap = students.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
    System.out.println(studentMap); // {Bob=75, Alice=85}

    // 8. Filtering and Mapping to a List of Objects
    List<Employee> employees = Arrays.asList(new Employee("John", 65000),
                                             new Employee("Jane", 55000),
                                             new Employee("Doe", 40000));
    List<String> salaryFilterOut = employees.stream()
                                   .filter(c -> c.getSalary() > 50000)
                                   .map(c -> c.getName())
                                   .collect(Collectors.toList());
    System.out.println(salaryFilterOut);


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
