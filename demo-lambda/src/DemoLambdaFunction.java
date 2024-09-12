import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class DemoLambdaFunction {
  public static void main(String[] args) {
    // Function f(x) = y
    // interface Function<T, R> {
    // R apply(T t);
    Function<String, Integer> strlength = str -> str.length();
    System.out.println(strlength.apply("Testing")); // 7

    Function<Integer, Integer> squareArea = x -> x * x;
    System.out.println(squareArea.apply(5)); // 25

    Function<Integer, String> intToStr = x -> x.toString();
    System.out.println(intToStr.apply(9988)); // 9988

    Function<List<String>, List<String>> noSpace = strList -> 
                                                  strList.stream().map(str -> str.replaceAll(" ", ""))
                                                  .collect(Collectors.toList());
    System.out.println(noSpace.apply(Arrays.asList("H e l l o ", " W o r l d "))); // [Hello,World]

    // Runtime Formula (differs to Class instance method & static method)
    Function<List<String>, Set<String>> lengthLargeThanThree = strings -> {Set<String> newStrings = new HashSet<>();
                                                  for (String s : strings) {
                                                      if (s.length() >= 2) 
                                                        newStrings.add(s);
                                                  }
                                                  return newStrings;
                                                };

    List<String> stringList = Arrays.asList("Liverpool", "  7 : 0  ", "Manchester United");
    Set<String> stringSet = lengthLargeThanThree.apply(stringList);
    System.out.println(stringSet); // [Liverpool,   7 : 0  , Manchester United]

    // BiFunction.class
    // interface BiFunction<T, U, R>
    // R apply(T t, U u);
    BiFunction<String, String, String> concat = (s1, s2) -> s1.concat(s2);
    System.out.println(concat.apply("Liverpool 7 : ", "0 Manchester United")); // Liverpool 7 : 0 Manchester United

    // Consumer.class
    // interface Consumer<T> {
    // void accept(T t);
    Consumer <String> score = s -> System.out.println("Japan" + s + "China");
    score.accept(" 7 : 0 "); // Japan 7 : 0 China

    // BiConsumer.class
    // interface BiConsumer<T, U> {
    // void accept(T t, U u)

    BiConsumer <Map<Integer, String>, Integer> mapValue = (map, key) -> System.out.println(map.get(key));

    Map<Integer, String> footballMap = new HashMap<>();
    footballMap.put(1, "Liverpool");
    footballMap.put(2, "Manchester City");
    footballMap.put(3, "Arsenal");
    footballMap.put(4, "Chelsea");
    footballMap.put(5, "Tottenham Hotspur");
    footballMap.put(6, "Everton");
    footballMap.put(7, "West Ham United");
    footballMap.put(8, "Leicester City");
    footballMap.put(9, "Southampton");
    footballMap.put(10, "Wolverhampton Wanderers");
    footballMap.put(11, "Aston Villa");
    footballMap.put(12, "Newcastle United");
    footballMap.put(13, "Crystal Palace");
    footballMap.put(14, "Brighton & Hove Albion");
    footballMap.put(15, "Burnley");
    footballMap.put(16, "Watford");
    footballMap.put(17, "Norwich City");
    footballMap.put(18, "Brentford");
    footballMap.put(19, "Leeds United");
    footballMap.put(20, "Manchester United");
    mapValue.accept(footballMap, 1); // Liverpool
    mapValue.accept(footballMap, 8); // Leicester City
    System.out.println("-------------------");

    // Supplier.class
    // Supplier<T> 
    // T get();

    // !!! "() -> Math.random()" is a formula to return Double, but not return Double
    Supplier<Double> randomNumber = () -> Math.random();
    System.out.println(randomNumber.get()); 
    
    Function<Integer, Integer> randomNumber2 = to -> new Random().nextInt(to) + 1;
    System.out.println(randomNumber2.apply(100)); // 0 ~ 99

    System.out.println("-------------------");

    // Predicate <T>
    // boolean test(T t);
    Predicate<Customer2> isChild = customer -> customer.getAge() < 18;
    System.out.println(isChild.test(new Customer2(15))); // true
    System.out.println(isChild.test(new Customer2(20))); // false

    Predicate<Customer2> isNameStartWithA = customer -> customer.getName().startsWith("A");

    // Test
    System.out.println(isChild.and(isNameStartWithA).test(new Customer2("Aaron", 15))); // true
    System.out.println(isChild.and(isNameStartWithA).test(new Customer2("Kenny", 20))); // false

    // BiPredicate <T, U>
    // boolean test(T t, U u);
    BiPredicate<Customer2, Customer2> isYoungerThen = (c1, c2) -> c1.getAge() < c2.getAge();
    System.out.println(isYoungerThen.test(new Customer2(15), new Customer2(20))); // true
    System.out.println(isYoungerThen.test(new Customer2(65), new Customer2(50))); // false

    // UnaryOperator<T> extends Function<T, T> {
    // static <T> UnaryOperator<T> identity() {
    // return t -> t;
    UnaryOperator<String> replaceSpaceByEmtryString = s -> s.replace(" ", "");
    System.out.println(replaceSpaceByEmtryString.apply("H e l l o    W o r l d ! ! !")); // HelloWorld!!!
    // Alternative
    Function<String, String> replaceSpaceByEmtryString2 = s -> s.replace(" ", "");
    System.out.println(replaceSpaceByEmtryString2.apply("H e l l o    W o r l d ! ! !")); // HelloWorld!!!

    // BinaryOperator<T> extends BiFunction<T,T,T> 
    // public interface BinaryOperator<T> extends BiFunction<T,T,T> {
    // public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) {
    // Objects.requireNonNull(comparator);
    // return (a, b) -> comparator.compare(a, b) <= 0 ? a : b;

    BinaryOperator<String> firstChar = (s1, s2) -> {
      String result = "";
    if (s1 != null && s1.length() > 0) 
        result += s1.charAt(0);
    if (s2 != null && s2.length() > 0) 
        result += s2.charAt(0);
      return result;
    };
    System.out.println(firstChar.apply("Hello", "World")); // HW
    
  }
}
