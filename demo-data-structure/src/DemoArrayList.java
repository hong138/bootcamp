import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DemoArrayList{


  public static void main(String[] args) {
    String[] arr = new String[] {"abc", "def", "ijk"};
    System.out.println(arr.length); // 3
    arr[1] = "hello"; // similar set
    for (String s : arr) {

    }
    System.out.println(arr[1]);
    // if we want to add one more String object to array object
    // you have to create another String array object, and then copy ....
    // so, array object is fixed length

    // After Java 5
    // ArrayList object is variable length
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("abc");
    strings.add("def");
    strings.add("ijk");
    strings.add("hello");
    System.out.println(strings.size()); // 4

    strings.set(1, "opq");

    for (String s : strings) {

    }

    System.out.println(strings.get(1)); // opq

    strings.remove(new String("ijk")); // !!!
    
    System.out.println(strings); // ArrayList.toString() -> [abc, opq, hello]

    ArrayList<Integer> integers = new ArrayList<Integer>();
    integers.add(1);
    integers.add(10000);
    integers.add(-2_100_000_000);
    System.out.println(integers.size()); // 3


    // !!! you should think of the scenario of without equals() in Customer.class
    // new ArrayList<Customer>() -> constructor
    ArrayList<Customer2> customers = new ArrayList<Customer2>();
    Customer2 john = new Customer2("John");

    customers.add(john);
    customers.add(john);
    System.out.println(customers.size()); // 2
    customers.remove(john); // Object.class equals() true -> break
    System.out.println(customers.size()); // 1

    customers.add(john);
    System.out.println(customers.size()); // 2

    ArrayList<Customer2> targetRemoveList = new ArrayList<>();
    targetRemoveList.add(john);

    customers.removeAll(targetRemoveList); // -> Customer.equals()

    System.out.println(customers.size()); // 0

    ArrayList<BigDecimal> decimals = new ArrayList<>();
    // add
    decimals.add(BigDecimal.valueOf(3.0));
    decimals.add(BigDecimal.valueOf(4.0));
    decimals.add(BigDecimal.valueOf(4.0));
    // remove
    decimals.remove(BigDecimal.valueOf(4.0)); // remove one and then break
    // size
    System.out.println(decimals.size());

    // 
    System.out.println(decimals.contains(BigDecimal.valueOf(3.0)));
    // ArrayList.class -> contains() -> for loop, break
    // but the defination of equals() is still controlled by BigDecimal.class

    // ask if contains both 3.0, 4.0
    ArrayList<BigDecimal> checkIfContain = new ArrayList<BigDecimal>();
    checkIfContain.add(BigDecimal.valueOf(3.0));
    checkIfContain.add(BigDecimal.valueOf(3.5));
    decimals.contains(checkIfContain);

    decimals.contains(Arrays.asList(BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0))); // true

    // ArrayList<Number> has not the parent of ArrayList<Integer>
    // ArrayList<Number> integers3 = new ArrayList<Integer>(); // compiler error

    // but Number is the parent of Integer
    Number n = new Integer(3);
    Number[] numbers = new Integer[] {3, 5, 6};
    numbers = new Long[] {3L, 5L, 6L}; // long -> Long

    long[] arr10 = new long[] {3, 5, 6};

    // Long L1 = new Integer(10); // Integer object has no relationship with Long object

    // int -> long (promotion)
    // long[] arr11 = new int[] {1, 2, 3}; // Not parent (Not promotion)

    System.out.println(decimals.isEmpty()); // false
    System.out.println(decimals.size() == 0); // false

    if (!decimals.isEmpty()){

    }

    // for loop - ArrayList
    for (int i = 0; i < decimals.size(); i++) {
      if (!decimals.isEmpty()){
          System.out.println("Index " + i + " is not Emtry");
        }
    }

    // for-each loop - ArrayList
    for (BigDecimal bd : decimals) {
    System.out.println(bd);
    }

    Subject chinese = new Subject(80, "Chinese");
    Subject english = new Subject(70, "English");
    Subject maths = new Subject(60, "Maths");
    ArrayList<Subject> subjects = new ArrayList<>();
    subjects.add(chinese);
    subjects.add(english);
    subjects.add(maths);
    Student peter = new Student("Peter", subjects);
    ArrayList<Student> students = new ArrayList<>();
    students.add(peter);
    System.out.println(students);

    subjects.clear();

    // Subject chinese = new Subject(80, "Chinese");
    // Subject english = new Subject(70, "English");
    // Subject math = new Subject(60, "Math");

    // ArrayList<Student> students = new ArrayList<>();

    // subjects.add(chinese);
    // subjects.add(english);
    // subjects.add(math);

    // Student peter = new Student("Peter", subjects);
    // Student paul = new Student("Paul", subjects);
    // Student mary = new Student("Mary", subjects);

    ArrayList<Object> objects = new ArrayList<Object>();

  }
}
