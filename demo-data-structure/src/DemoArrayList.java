import java.math.BigDecimal;
import java.util.ArrayList;

public class DemoArrayList {
  
  public static void main(String[] args) {
    String[] arr = new String[] {"abc", "def","hij"};
    System.out.println(arr.length); // 3

    // if we want to add one more String object to array object
    // you have to create another String array object, and then copy ....
    // So, array object is fixed length

    // After Java 5
    // ArrayList object is variable length
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("klm");
    strings.add("nop");
    strings.add("qrs");
    strings.add("tuv");
    System.out.println(strings.size()); // 4

    strings.set(2, "hihi");

    for (String s : strings) {
      
    }

    System.out.println(strings.get(2));

    strings.remove("nop");
    
    System.out.println(strings); // ArrayList.toString() -> [klm, hihi, tuv]

    ArrayList<Integer> integers = new ArrayList<Integer>();
    integers.add(1);
    integers.add(64);
    integers.add(2800);
    System.out.println(integers.size()); // 3

    ArrayList<Customer> customers = new ArrayList<Customer>();
    // customers.add(new Customer("John"));
    // customers.add(new Customer("John"));
    Customer john = new Customer("John");
    customers.add(john);
    customers.add(john);
    System.out.println(customers.size()); // 2
    customers.remove(john); // Object.class equals() true -> break
    System.out.println(customers.size()); // 1

    ArrayList<BigDecimal> decimals = new ArrayList<BigDecimal>();
    BigDecimal x = new BigDecimal(2);
    BigDecimal y = new BigDecimal(3);
    BigDecimal z = new BigDecimal(4);
    decimals.add(x);
    decimals.add(y);
    decimals.add(z);
    System.out.println(decimals.size()); // 3
    decimals.remove(z);



    // customers.remove(new Customer("John")); // Object.class equals()
    // System.out.println(customers.size()); // 2
    
  }
}
