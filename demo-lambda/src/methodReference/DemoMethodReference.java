package methodReference;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    Supplier<Book> book = () -> new Book(); // lambda expression
    Supplier<Book> book2 = Book::new; // !!! method reference (one output) "::new" call constructor

    // !!! NOT OK, "Book::new" is a formula to create book object
    // Book book = Book::new;

    // static method (Void)
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
    integers.forEach(e -> System.out.println(e)); // lambda (consumer)
    integers.forEach(System.out::println); // !!! method reference (one input)

    // instance method (With return value, No param)
    String name = "John";
    Supplier<Integer> nameLength = () -> name.length(); // lambda
    System.out.println(nameLength.get()); // 4

    Supplier<Integer> nameLength2 = name::length; // !!! one output

    // !!! 2 input + 1 output
    List<String> strings = Arrays.asList("apple", "orange", "banana");
    // Lambda (Comparator)
    Comparator<String> sorts = (s1, s2) -> s1.compareTo(s2); // ascending
    Collections.sort(strings, sorts);
    System.out.println(strings); // [apple, banana, orange]

    // Method reference (Comparator)
    strings = Arrays.asList("apple", "orange", "banana");
    Comparator<String> formula = String::compareTo; // compareTo is an instance method in String class
    Collections.sort(strings, formula);
    System.out.println(strings); // [apple, banana, orange]




  }
}
