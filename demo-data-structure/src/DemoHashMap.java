import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  
  public static void main(String[] args) {
    // Map consists of entries
    // An entry consists of a key and a value
    Map<Integer, String> map = new HashMap<>();
    map.put(10, "Peter");
    map.put(20, "John");
    map.put(15, "Mary");
    map.put(38, "Ken");
    map.put(25, "Aaron");
    // map.put("Peter", 10); // Wrong type of value object

    System.out.println(map);
    System.out.println(map.size()); // 2 entries
    System.out.println(map.get(20)); // get value object
    System.out.println(map.get(50)); // null

    // For-each
    for (Map.Entry<Integer, String> entry : map.entrySet()){
      System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
    }
    System.out.println("----------");

    // Person.class
    // Map<String, Person> personMap = new HashMap<>()
    // Key=Person's Name, Value = Person object
    // put
    // size
    // get
    // for -> print all person data
    Map<String, Person> personMap = new HashMap<>();
    Person john = new Person("John", 65);
    Person mary = new Person("Mary", 60);
    Person tony = new Person("Tony", 70);
    Person alan = new Person("Alan", 62);
    Person peter = new Person("Peter", 68);
    Person andy = new Person("Andy", 55);
    Person annie = new Person("Annie", 20);

    personMap.put(john.getName(), john);
    personMap.put(mary.getName(), mary);
    personMap.put(tony.getName(), tony);
    personMap.put(alan.getName(), alan);
    personMap.put(peter.getName(), peter);
    personMap.put(andy.getName(), andy);
    personMap.put(annie.getName(), annie);

    System.out.println(personMap.get("Andy"));

    System.out.println(personMap.size());

    // for -> print all person data
    // Map -> Entry<String, Person> -> Person -> Nmae, Age
    // Sum of the age of all perosn
    int sum = 0;
    for (Map.Entry<String, Person> entry : personMap.entrySet()){
      sum += entry.getValue().getAge();
    }
    System.out.println(sum);

    for (Map.Entry<String, Person> entry : personMap.entrySet()){
      System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue().getAge());
    }
    System.out.println("----------");

    // put() -> overwrite when the key exists
    // If key exists, overwrite value (Ken replace Vincent)
    // It is still the original entry
    map.put(38, "Vincent");
    System.out.println(map.size());
    System.out.println(map);

    System.out.println(map.containsKey(38));
    System.out.println(map.containsKey(-38));
    System.out.println(map.containsValue("Vincent"));
    System.out.println(map.containsValue("Carrie"));

    String s = map.remove(38);
    System.out.println(s);
    System.out.println(map.size());

    if (map.remove(20, "John")){
      System.out.println("Entry is removed.");
    }

    // Loop all keys (keySet())
    sum = 0;
    for (Person value : personMap.values()){
      System.out.println(value.getName() + ", " + value.getAge());
      sum += value.getAge();
    }
    System.out.println("Sum of all person's age = " + sum);

    // entrySet(), keySet(), values() -> for loop

    System.out.println(personMap.size());
    personMap.clear();
    System.out.println(personMap.size());
    System.out.println("----------");

    // HashMap vs List (ArrayList, LinkedList)
    // 1. HashMap has no ordering
    // 2. HashMap get value by key(any type), List get value by index (int)
    // 3. Map's Key cannot be duplicated, List may contain duplicated value

    // !!!How to identify the key is duplicated?
    Map<HKID, Person> citizenMap = new HashMap<>();
    citizenMap.put(new HKID("1234"), john);
    citizenMap.put(new HKID("1235"), mary);
    citizenMap.put(new HKID("1235"), annie);

    System.out.println(citizenMap.get(new HKID("1235"))); // null

    System.out.println(citizenMap.size());
    citizenMap.put(new HKID("1234"), john);
    System.out.println(citizenMap.size());
    System.out.println(citizenMap);

    // The implementation of put() method -> object's equals() & hashMap()
    // 


  }
}
