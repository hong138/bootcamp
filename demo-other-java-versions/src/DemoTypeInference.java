
import java.util.ArrayList;

public class DemoTypeInference {
  public static void main(String[] args) {
    int age = 5;
    var age2 = 5;
    // !!! Java Compiler convert "var" to int, 
    // !!! because you assign int value 5 to it (first assignament)
    // !!! var type never exists in byte code (class file)
    // age2 = 6.0; // double value -> int type

    String name = "John";
    var name2 = "John";

    name2.charAt(2); // VSCode help you identify name2 is String variable

    var strings = new ArrayList<String>();
    strings.add("abc");
    strings.add("def");

    for (var string : strings){
      System.out.println(string);
    }

    // re-assign value to var type variable
    age2 = 10;
    // age2 = "abc"; // error

    // method input parameter type
    // !!! method input parameter type, error
    // public static sum (var a, var b) {
    //   return a + b;
    // }

    // method return type
    // !!! method return type, error
    // public static var sum
    // method output parameter type

    // class attribute type
    
    // lambda expression(Not support)
    // var nameLength2 = () -> "abc".length;


    // assign null value to var type variable
    // !!! var x = null; // first assignment has to be non-null value

    // int x = (var) 7;
    var y = (int) 8;
    var s = "abcdef";
    var result = s.length();
    System.out.println(result); // 6

  }
}
