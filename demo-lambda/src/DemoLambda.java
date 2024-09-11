public class DemoLambda {
  public static void main(String[] args) {
    Superman superman = new Superman();
    superman.fly();

    Flyable superman2 = new Superman();
    superman2.fly();

    // Create object without class
    // In Java 8 - Lamb Expression (For Functional Interface)
    Flyable superman3 = () -> System.out.println("Superman is flying...");
    superman3.fly(); // Superman is flying...

    // !!! Create object without class
    // Anonymous
    Flyable superman4 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superman is flying...");
      }
    };
    superman4.fly(); // Superman is flying...

    // Calculator
    MathOperation addition = (x, y) -> x + y;
    MathOperation subtraction = (x, y) -> x - y;
    MathOperation multipul = (x, y) -> x * y;
    MathOperation divided = (x, y) -> x / y;

    System.out.println(addition.compute(4, 5)); // 9
    System.out.println(subtraction.compute(4, 5)); // -1
    System.out.println(multipul.compute(4, 5)); // 20
    System.out.println(divided.compute(20, 5)); // 4

    // Other syntax ...
    // !!! More than one line of code...
    // !!! 1. Need to add code block {}
    // !!! 2. Need to use "return" 
    MathOperation process = (a, b) -> {
      if (a > 10)
        return a + b;
      return a - b;
    };
    MathOperation process2 = (a, b) -> a > 10 ? a + b : a - b;
    process.compute(10, 1); // 9
    process.compute(20, 1); // 21

    StringManager concatHello = str -> str.concat("Hello");
    System.out.println(concatHello.operate("Hihi")); // HihiHello

    StringManager removeSpace = str -> str.replace(" ", "");
    System.out.println(removeSpace.operate("q w e r t y u i o p ")); // qwertyuiop
}
}
