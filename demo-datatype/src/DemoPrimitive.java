public class DemoPrimitive{
  public static void main(String[] args) {
    // every line of java code nust end with ; 
    // Declaration and Assisgnment
    int x = 100;

    // Declaration
    // "int" is a type that can store an integer
    int y;
    // Assisgnment
    y = -13;
    System.out.println(y); // -13
    // Re-assignment
    y = 9;
    System.out.println(y); // 9

    System.out.println(x); //100
    System.out.println(20); // 20
    System.out.println(y); //9

    int age = 30;
    // int q = 30.5 // 30.5 is number with decimal, q is declared by int, so cannot decimal place
    double q = 30.5;
    System.out.println(q); // 30.5

    double u = 10; // 10 is int value
    // when int value assigned to double type variable, 
    // Java will help to double value (10 -> 10.0),
    // Finally, assignment -> 10.0 -> u

    double i = 10.0;
    // 10.0 is a double value, assign to varaible i

    // int k = 10.3;
    // 10.3 is a double value, you cannot assign double to int type variable
    // because the level of double type is higher than int type

    // char -> Character
    char c  = 'i';
    char c2 = '9';
    char c3 = ' ';
    // char c4 = ''; // at lease one character

    double d1 = 3.3; // by default 3.3 is double value
    double d2 = 3.3d; // "d" is to describe 3.3 is a double value
    // float f1 = 3.3; // 3.3 is double, which is higher level than float
    // float is lower level type comparing with double
     
    float f2  = 3.3f; // assign float value to float variable
    double d3 = 3.3f; // 3.3f is float value, lower level value can be assigned to higher type

    int h   = 4; // 4 is int value
    long l4 = 4; // long is a higher level than int: 4 int value -> 4 long value

    long l2 = 4L; // 4L is long value

    // Primitives:
    // int, long, byte, short
    // float, double
    // char
    // boolean

    // Integer: byte -> short -> int -> long
    byte b1  = 3; // from -128 to 127
    // assign int value to byte variable
    // int value -> byte value (implicitly)

    int i2   = 3;
    // byte b2 = i2; // Java not allow higher level type to lower level type

    // Assign byte variable to int variable
    int i3   = b1; // OK

    // b1 = 128; // out of range

    // Short
    short s2 = 22222;
    // short s3 = 77777;
    int i4   = 88888;
    // short s4 = i4;

    short s1 = 3; // from -32678 to 32677
    int i1   = 3; // from -2.1b to 2.1b
    long l1  = 3; // from -2^63 to 2^63

    // int i4 = 3L; // explilcity assign long value

    // 
    boolean bl  = false;
    boolean bl2 = true;

    boolean result = 3 > 2; // ture
    System.out.println(result);
    System.out.println(3 > 2);
    System.out.println(2 > 3);

    int age2 = 66;
    boolean isElderly = age2 > 65; // event or definition
    System.out.println(isElderly); // true

    

  }
}