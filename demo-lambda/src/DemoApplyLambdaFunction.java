import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DemoApplyLambdaFunction {
  public static void main(String[] args) {
    // for-each
    List<String> strings = new LinkedList<>();
    for (String s : strings) {
      System.out.println(s);
    }

    // !!! List.foreach (Java 8) -> Consumer.class
    strings.forEach(s -> System.out.println(s));

    List<Customer2> customers = Arrays.asList(new Customer2(19), new Customer2(30));
    // filter customer whose age > 20, and print his age
    customers.forEach(customer -> {
      if (customer.getAge() > 20) {
        System.out.println(customer.getAge());
      }
    });

    Map<String, Integer> nameMap = new HashMap<>();
    nameMap.put("Virgil", 4);
    nameMap.put("Endo", 3);
    nameMap.put("Eillot", 19);
    // default V computeIfAbsent (K key, Function<? super K,? extends V> mappingFunction)
    nameMap.computeIfAbsent("Robertson", s -> 26);
    System.out.println(nameMap.get("Robertson")); // 26
    nameMap.computeIfAbsent("Endo", s -> 5);
    System.out.println(nameMap.get("Endo")); // 3

    nameMap.merge("Endo", 3, (x1, x2) -> x1 + x2); // (original, multiplier) -> original + multiplier
    System.out.println(nameMap.get("Endo")); // 6

    nameMap.merge("Jota", 20, (x1, x2) -> x1 + x2);
    System.out.println(nameMap.get("Jota")); // 20

    nameMap.put("Antony", -1);
    System.out.println(nameMap.get("Antony")); // null

    // All entry'value * 2, if the value is not null, otherwise, remove the entry
    for (String key : nameMap.keySet()) {
      nameMap.merge(key, 2, (x1, x2) -> {
        if (x1 < 0)
          return null;
        return x1 * x2; 
    });
  }

    System.out.println(nameMap);

    nameMap.merge("Jota", 20, (x1, x2) -> {
      if (x1 + x2 > 25)
        return null;
      return x1 + x2;
    });

    System.out.println(nameMap.containsKey("Jota")); // false
  }
}
