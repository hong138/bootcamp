import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoOptional {
  public static void main(String[] args) {
    // String[] -> List<String>
    // Arrays.asList() is just for non-Primitive 
    String[] strings = new String[] {"abc", "def", "ghi"};
    System.out.println(Arrays.asList(strings)); // [abc, def, ghi]

    int[] arr = new int[] {3, -10, 2, -1};
    // int[] -> List<Integer>
    // stream() + boxed()
    System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList())); // [3, -10, 2, -1]

    // int[] -> IntStream
    Arrays.stream(arr)
    .filter(e -> e > 1)
    .forEach(e -> System.out.println(e));

    System.out.println(Arrays.stream(arr).filter(e -> e > 0).sum());

    List<Customer2> customer = Arrays.stream(arr)
                               .boxed().filter(e -> e >= 0)
                               .map(age -> new Customer2(age))
                               .collect(Collectors.toList());
    System.out.println("------------------------------");

    // Stream + Optional
    int[] arr2 = new int[] {3, 10, 1, 100, 11};
    List<Integer> integers = Arrays.stream(arr2)
                             .boxed().filter(e -> e > 10)
                             .collect(Collectors.toList());
    System.out.println(integers.size()); // 2

    Optional<Integer> result = Arrays.stream(arr2).boxed()
                               .filter(e -> e > 10)
                               .findFirst(); // !!! or findAny()
    System.out.println(result);
    if (result.isPresent()) {
      System.out.println(result.get());
    } else {
      System.out.println("Not found");
    }

    // !!! consumer (void)
    // !!! ifPresent -> if(result.isPresent) + do something 
    result.ifPresent(e -> System.out.println(e)); // 100

    // Optional
    Optional<String> string = Optional.of("abc");
    // System.out.println(Optional.of(null)); // java.lang.NullPointerException

    Optional<String> string2 = Optional.ofNullable(null);
    System.out.println(string2); // Optional.empty

    Optional<String> string3 = Optional.empty(); // ! same as Optional.ofNullable(null)
    System.out.println(string3.isPresent()); // false

    // ! How to resolve Optional of value
    // 1. isPresent() -> get()
    // 2. ifPresent()
    // 3. orElse(), from Optional<T> to T
    System.out.println(result.orElse(10));
    // 4. orElseThrow()
    System.out.println(result.orElseThrow(() -> new RuntimeException("No value > 10")));
    // 5. orElseGet()
    System.out.println(result.orElseGet(() -> 10));

    // !!! Advantages and use cases for Optional<T>
    // ! Good:
    // 1. Optional should be used for return type ONLY!!! (Similar to throw checked exception)
    // ! Bad:
    // 2. We never use Optional in method parameters
    // 3. Never use Optional as type of class attribute, because it does not support serialization

    Optional<Customer2> customer3 = get("John");

    // concat(null, "hello");

  }

  public static Optional<Customer2> get(String name){
    // select form Database
    List<Customer2> resultSet = List.of(new Customer2("John", 10), new Customer2("Tom", 20));
    
    return resultSet.stream().filter(e -> name.equals(e.getName())).findAny();

    // Bad idea
    // !!! Optional Parameter design doesn't help solving the chance of null value
    public static String concat(Optional<String> s1, String s2) {
      if (s1 != null && s1.isPresent())
        return s1.get().concat(s2);
      throw new IllegalArgumentException();
    }
  }
}
