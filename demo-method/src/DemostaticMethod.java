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
        totalArea += calculateCirculeArea(radiusList2[i]);
      }
    }
    // if input is able to produce output, then it is a static method
  public static double calculateCirculeArea(double radius){
    // return radius * radius * Math.PI;

    // Method name -> start with verb
    // pow(base, index) -> base ^ index
    return Math.pow(radius, 2.0) * Math.PI;
}
  public static double inputNumber(double number){
    return 123;
  }
}