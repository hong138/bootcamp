import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    // Stream.class
    Stream<String> strings = Stream.of("abc", "def");
    // for-each (Iterable) (Stream cannot use for-each)
    // for (String s : strings) {
    // System.out.println(s);
    // }

    // Both List and Stream can use forEach()
    strings.forEach(s -> {
      System.out.println(s);
    });

    Stream<Customer2> customers = Stream.of(new Customer2("Alice", 18), new Customer2("Bob", 20));
    customers.forEach(c -> System.out.println(c.getName() + "," + c.getAge()));

    // After Java 8, we have Stream.class, which contains lots of powerful methods / functionalites
    // !!! Convert List to Stream
    List<Customer2> customers2 = Arrays.asList(new Customer2("Alice", 18), new Customer2("Bob", 20));
    Stream<Customer2> customerStream = customers2.stream();
    
    // !!! Convert Stream to List
    List<Customer2> customer3 = customerStream.collect(Collectors.toList());

    // Stream Objects -> filter()
    List<Customer2> customers4 = customers2.stream()           // return Stream<Customer2>
                                .filter(c -> c.getAge() > 18)  // return Stream<Customer2>
                                .collect(Collectors.toList()); // return List<Customer2>

    System.out.println(customers4); // [Bob, 20]

    // Stream Objects -> map() + collect()
    // similar to for-loop + new ArrayList() + add()
    List<String> names = customers2.stream()                 // return Stream<Customer2>
                        .map(c -> c.getName())               // !!! return Stream<String>
                        .collect(Collectors.toList());       // !!! return List<String>
    System.out.println(names); // [Alice, Bob]

    // filter() can work together with map()
    // 1. filter() before map()
    List<String> namesFilterMap = customers2.stream()                
                        .filter(c -> c.getAge() > 18)        
                        .map(c -> c.getName())
                        .collect(Collectors.toList()); 
    System.out.println(namesFilterMap); // [Bob]

    // 2. map() before filter()
    List<String> namesMapFilter = customers2.stream()
                                  .map(c -> c.getName())
                                  .filter(c -> c.startsWith("A"))
                                  .collect(Collectors.toList());
    System.out.println(namesMapFilter); // [Alice]

    // List<String> namesTrial = customers2.stream()
    //                           .map(c -> c.startsWith("A"))
    //                           .filter(c -> c.getName())
    //                           .collect(Collectors.toList());
    // System.out.println(namesTrial);
    System.out.println("-------------------------------------------------------------------");

    // sum(), count()
    long count = customers2.stream().count();
    System.out.println(count); // 2

    // Stream object -> mapToInt -> IntStream object -> sum()
    int sumOfAge = customers2.stream()
                  // You can filter here
                  .mapToInt(c -> c.getAge())
                  .sum(); 
    System.out.println(sumOfAge); // 38

    // IntStream object -> max(), min(), average()
    int maxAge = customers2.stream().mapToInt(c -> c.getAge()).max().getAsInt();
    int minAge = customers2.stream().mapToInt(c -> c.getAge()).min().getAsInt();
    double avgAge = customers2.stream().mapToInt(c -> c.getAge()).average().getAsDouble();
    System.out.println("maxAge:" + maxAge + ", minAge:" + minAge + ", avgAge:" + avgAge); // maxAge:20, minAge:18, avgAge:19.0

    // IntStream -> distinct()

    // Collect to Set

    // Array -> Stream
    int[] arr = new int[]{18, 2, 13, 4, 15};
    IntStream ints = Arrays.stream(arr);
    Stream<Integer> integers = ints.boxed();
    Set<Integer> integerSet = integers.collect(Collectors.toSet());
    System.out.println(integerSet); // [18, 2, 13, 4, 15]

  }
}
