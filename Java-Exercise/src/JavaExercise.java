
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
    System.out.println("1." + squareNumbers);  // [100, 64, 36, 16, 4]
    
    // 2. Filtering and Collecting
    List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex"); 
    List<String> filterA = names.stream()
                           .filter(n -> n.startsWith("A"))
                           .collect(Collectors.toList());
    System.out.println("2." + filterA);  // [Alice, Annie, Alex]

    // 3. Finding Maximum and Minimum
    List<Integer> numbers3 = Arrays.asList(10, 20, 5, 30, 15);
    int max = numbers3.stream().mapToInt(Integer::intValue).max().getAsInt();
    int min = numbers3.stream().mapToInt(Integer::intValue).min().getAsInt();
    System.out.println("3.max=" + max + ", min=" + min); // max=30, min=5

    // 4. Mapping to a List of Lengths
    List<String> words = Arrays.asList("apple", "banana","pear");
    List<Integer> wordsLength = words.stream().map(s -> s.length()).collect(Collectors.toList());
    System.out.println("4." + wordsLength); // [5, 6, 4]

    // 5. Counting Elements
    List<String> words5 = Arrays.asList("hi", "hello","world","java","stream");
    long greaterThanThree = words5.stream().filter(c -> c.length() > 3).count();
    System.out.println("5." + greaterThanThree); // 4

    // 6. Filtering and Collecting to a Set
    List<Integer> numbers6 = Arrays.asList(5, 10, 15, 20, 10, 5);
    Set<Integer> greaterThanTen = numbers6.stream().filter(c -> c > 10).collect(Collectors.toSet());
    System.out.println("6." + greaterThanTen); // [20, 15]

    // 7. Mapping to a Map (Key-Value Pairs)
    List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
    Map<String, Integer> studentMap = students.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
    System.out.println("7." + studentMap); // {Bob=75, Alice=85}

    // 8. Filtering and Mapping to a List of Objects
    List<Employee> employees = Arrays.asList(new Employee("John", 65000),
                                             new Employee("Jane", 55000),
                                             new Employee("Doe", 40000));
    List<String> salaryFilterOut = employees.stream()
                                   .filter(c -> c.getSalary() > 50000)
                                   .map(c -> c.getName())
                                   .collect(Collectors.toList());
    System.out.println("8." + salaryFilterOut); // [John, Jane]


    // 9. Grouping and Collecting to a Map (Group by Age)
    List<Person> people = Arrays.asList(
                          new Person("Alice", 30),
                          new Person("Bob", 25),
                          new Person("Charlie", 30)
                      );
    
    Map<Integer, List<String>> groupedByAge = people.stream()
                      .collect(Collectors.groupingBy(Person::getAge, 
                      Collectors.mapping(Person::getName, Collectors.toList())));
      
    System.out.println("9." + groupedByAge); // {25=[Bob], 30=[Alice, Charlie]}


    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    List<Person2> people2 = Arrays.asList(
                            new Person2("Alice", "Female"),
                            new Person2("Bob", "Male"),
                            new Person2("Charlie", "Male")
                          );

    Map<Boolean, List<Person2>> byGender = people2.stream()
                                           .collect(Collectors.partitioningBy(e -> e.getGender() == "Male"));
    System.out.println("10." + byGender); // {false=[Alice], true=[Bob, Charlie]}

    // 11. Filtering, Mapping, and Collecting to a LinkedHashSet
    List<Integer> numbers11 = Arrays.asList(5, 15, 20, 7, 30);

    List<Integer> lessThanTen = numbers11.stream()
                                .filter(e -> e > 10)
                                .map(e -> e * 2)
                                .collect(Collectors.toList());
    System.out.println("11." + lessThanTen); // [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    List<String> names12 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;

    List<Person> mapPerson = names12.stream().map(e -> new Person(e, defaultAge)).collect(Collectors.toList());
    System.out.println("12." + mapPerson); // [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]


    // 13. Mapping and Collecting to a Deque
    List<String> words13 = Arrays.asList("hello", "world", "java");
    Deque<String> uppercase =  words13.stream().map(e -> e.toUpperCase()).collect(Collectors.toCollection(LinkedList::new));
    System.out.println("13." + uppercase); // [HELLO, WORLD, JAVA]

    // 14. Transforming and Collecting to a Array
    List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4);
    ArrayList<Integer> square = numbers14.stream().map(e -> e * e).collect(Collectors.toCollection(ArrayList::new));
    System.out.println("14." + square); // [1, 4, 9, 16]


    // 15. Map and Reduce
    List<Product> products = Arrays.asList(
                             new Product("Book", 10), 
                             new Product("Pen", 5), 
                             new Product("Notebook", 7)
                           );
    int totalPrice = products.stream().map(Product::getPrice).reduce(0, Integer::sum);
    System.out.println("15." + totalPrice); // 22

    // 16. Grouping
    List<Employee2> employees2 = Arrays.asList(
                          new Employee2("Alice", "HR"),
                          new Employee2("Bob", "IT"),
                          new Employee2("Charlie", "HR"),
                          new Employee2("David", "IT")
    );
    Map<String, List<Employee2>> groupByDepartment = employees2.stream()
                                                     .collect(Collectors.groupingBy(Employee2::getDepartment, 
                                                     Collectors.toList()));
    System.out.println("16." + groupByDepartment);


    // 17. Parallel Streams
    List<Integer> numbers17 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int sum = numbers17.parallelStream().reduce(0, Integer::sum);
    System.out.println("17." + sum); // 55


    // 18. FlatMap
    List<List<Integer>> listOfLists = Arrays.asList(
                                      Arrays.asList(1, 2, 3),
                                      Arrays.asList(4, 5, 6),
                                      Arrays.asList(7, 8, 9)
    );

    List<Integer> flatMapGreaterThan5 = listOfLists.stream()
                                        .flatMap(List::stream)
                                        .filter(c -> c > 5)
                                        .collect(Collectors.toList());
    System.out.println("18." + flatMapGreaterThan5); // [6, 7, 8, 9]


    // 19. Distinct and Sorting
    List<String> words19 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

    List<String> alphaOrder = words19.stream()
                              .distinct()
                              .sorted()
                              .collect(Collectors.toList());
    System.out.println("19." + alphaOrder); // [apple, banana, grape, orange]


    // 20. Partitioning By
    List<Student> students20 = Arrays.asList(
                               new Student("Alice", 45),
                               new Student("Bob", 55),
                               new Student("Charlie", 40),
                               new Student("David", 70)
    );

    Map<Boolean, List<String>> passStudents = students20.stream()
                                              .collect(Collectors.partitioningBy(s -> s.getScore() >= 50
                                              , Collectors.mapping(Student::getName, Collectors.toList())));
    System.out.println("20." + passStudents); // {false=[Alice, Charlie], true=[Bob, David]}


    // 21. Joining Strings
    List<String> words21 = Arrays.asList("Java", "Streams", "Are", "Fun");
    String combined = words21.stream().collect(Collectors.joining(", "));
    System.out.println("21." + combined); // Java, Streams, Are, Fun


    // 22. Find First and Any
    List<Integer> numbers22 = Arrays.asList(4, 7, 9, 12, 16, 21);
    Optional<Integer> divisibleBy3 = numbers22.stream().filter(c -> c % 3 == 0).findFirst();
    if (divisibleBy3.isPresent()) {
      System.out.println("22." + divisibleBy3.get()); // 9
    } else {
      System.out.println("Not found");
    }


    // 23. Limit and Skip
    List<Integer> numbers23 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> limited = numbers23.stream().skip(3).limit(5).collect(Collectors.toList());
    System.out.println("23." + limited); // [4, 5, 6, 7, 8]


    // !!! 24. Peek (Debugging in Streams)
    List<Integer> numbers24 = Arrays.asList(1, 2, 3, 4);
    List<Integer> peeked = numbers24.stream().map(e -> e + e).peek(System.out::println).collect(Collectors.toList());
    System.out.println("24." + peeked);


    // 25. Optional and Streams
    List<String> words25 = Arrays.asList("hi", "hello", "cat", "dog");
    Optional<String> fourCharacters = words25.stream()
                                      .filter(e -> e.length() > 4)
                                      .findFirst();
    System.out.println("25." + fourCharacters.get()); // Optional[hello]


    // !!! 26. Custom Collector
    List<Integer> numbers26 = Arrays.asList(1, 2, 3, 4, 5, 5, 6);


    // 27. Using Stream to Manipulate Arrays
    int[] numbers27 = {1, 2, 3, 4, 5};
    int manipulate = Arrays.stream(numbers27).sum();
    System.out.println("27." + manipulate);

    // 28. Stirng Length Calculation
    List<String> words28 = Arrays.asList("Java", "Streams", "Practice");
    int totalWords = words28.stream().mapToInt(String::length).sum();

    System.out.println("28." + totalWords);
    
  }
}
