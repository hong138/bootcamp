// package questions;
// /**
//  * Expected Output:
//  * 
//  * I am going to add two numbers together:
//  * The first one: 31
//  * The second one: 42
//  * The sum is 73
//  * The subtraction reuslt is 11
//  * The another sum result is 130
//  * The variable varB is false
//  * The variable varC is true
//  * The variable fnumber is -130.2
//  * The variable dnumber is -20.5
//  * The variable reminder is 1
//  * The variable result is 3
//  */
// // Primitive types and operators
public class JavaQuest1 {

  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");
    int first = 31;
    // declare the second one
    // code here ...

    // String x = 'int(first)';
    // String second = first.charAt(0);
    int second = 42;

    System.out.println("The first one: " + first);
    System.out.println("The second one: " + second);

    // Add two numbers and print it out
    // code here ...
    int sum = first + second;
    System.out.println("The sum is " + sum);

    // subtraction
    // code here with tips, pls fix ...
    int subtract = first - second;
    System.out.println("The subtraction reuslt is " + subtract);

    // another sum
    byte b1 = 60;
    byte b2 = 70;
    // code here with tips, pls fix ...
    int sum2 = b1 + b2;
    System.out.println("The another sum reuslt is " + sum2);

    // declare two boolean variable with true and false value
    // code here
    int x = 50;
    int z = 60;

    if (x > z) {
      System.out.println("The variable varB is " + (x > z));
    } else {
      System.out.println("The variable varC is " + (x < z));
    }

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    fnumber = -130.2f;
    dnumber = -20.5f;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

    // Find reminder. Declare variable a & reminder
    int a = 7;
    int b = 3;
    b=6;
    // Fix it ...
    int reminder = a - b;
    System.out.println("The variable reminder is " + reminder);

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    int x2 = 2;
    // code here ... define the x and assign value to it
    int result = e - o * x2 / y;
    System.out.println("The result is " + result);
  }
}