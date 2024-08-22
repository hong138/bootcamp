public class DemostaticMethod {
  public static void main(String[] args) {
    // Approach 2:
    // Bad -> careless mistake -> wrong formula
    double radius1 = 1.3;
    System.out.println(radius1 * radius1 * 3.14);
    double radius2 = 1.4;
    System.out.println(radius2 * radius2 * 3.14);
    double radius3 = 1.5;
    System.out.println(radius3 * radius3 * 3.14);

    // Approach 2
    // Bad ->
    double[] radiusList = new double[] {1.3, 1.4, 1.5};
    for (int i = 0; i < radiusList.length; i++) {
        System.out.println(radiusList[i] * radiusList[i] * 3.14);
    }

    // Approach 3
    double[] radiusList2 = new double[] {1.3, 1.4, 1.5};
    // Sum up all circle area
    double totalArea = 0;
    for (int i = 0; i < radiusList2.length; i++) {
        totalArea += calculateAreaForCircule(radiusList2[i]);
      }

    // input (parameters) -> "abc"
    String encrypted = encrypt("abc");
    System.out.println(encrypted);

    String original = decrypt(encrypted);
    System.out.println(original);

    // if output type = String, then you must return String value inside the method

    // Static method
    // encrypt("abc") / System.out.println("hello")
    // charAt("abc",1)

    // Instance method 
    // "abc".charAt(0) -> object presentation

    // Compiler knows which method the caller is referring during compile time
    System.out.println(sum(1, 2));

    // during compile time, checked that there is no sum (double, double)
    // System.out.println(sum(1.1, 2.1)); // compiler error
    System.out.println(sum(1, 2, 3));
    System.out.println(sum(1L, 2L));
    System.out.println(sum((byte) 1, (byte) 2));
    System.out.println(sum(1f, 2f));

    double d1 = sum(1.2f, 3.6f);

    print(7, 8);

    System.out.println("Circule Area= " + calculateAreaForCircule(6));
    System.out.println("Square Area= " + calculateAreaForSquare(6));
    }
    ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////
    // if input is able to produce output, then it is a static method
  public static double calculateAreaForCircule(double radius){
    // return radius * radius * Math.PI;

    // Method name -> start with verb
    // pow(base, index) -> base ^ index
    return Math.pow(radius, 2.0) * Math.PI;
}

    public static double calculateAreaForSquare(double length){
      return Math.pow(length, 2.0);
    }

    public static String encrypt(String password){
    char[] characters = password.toCharArray();
    String encrypted = "";
    for (int i = 0; i < characters.length; i++){
        encrypted += (char) ((characters[i] + 3) * 2);
    }
    return encrypted;
  }

  public static String decrypt(String encrypted){
    char[] characters = encrypted.toCharArray();
    String original = "";
    for (int i = 0; i < characters.length; i++){
      original += (char) (characters[i] / 2 - 3);
    }
    return original;
  }

  // Method Signature = Method Name + Number of Parameters & Type of Parameters
  public static int sum (int x, int y){
    System.out.println("Method sum(int x, int y)");
    return x + y;
  }

  public static int sum (int x, int y, int z){
    System.out.println("Method sum(int x, int y, int z)");
    return x + y + z;
  }

  // Method Signature
  // sum(float x, float y) != sum(int x, int y)
  public static float sum (float x, float y){
    System.out.println("Method sum(float x, float y)");
    float result = x + y;
    return new Float(result); // return float object
  }

  // Return Type: premitive + wrapper + String
  // void -> return nothing (No "return" keyword)
  public static void print(int x, int y){
    System.out.println("x=" + x);
    System.out.println("y=" + y);
  }
}