public class Demoif {
  public static void main(String[] args) {
    int x = 30;

    if (x >= 30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println(x < 30);
    }

    boolean isLargerThan30 = x >= 30;

    if (isLargerThan30) {
      System.out.println("x >= 30");
    } else {
      System.out.println(x < 30);
    }
    
    // 8 primitives, String (equals(), charAt(), length())

    // Example 1
    int number = -3;

    if (number > 0){
      System.out.println("The number is positive");
    } else if (number < 0){
      System.out.println("The number is negative");
    } else{
      System.out.println("The number is zero");
    }

    // The number is positive
    // The number is negative
    
    // Example 2 (Avoid overlap)
    int score = 85;

    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90){
      System.out.println("B");
    } else {
      System.out.println("F");
    }

    // Example 3
    int a = 10;
    int b = 20;
    int max;
    int min;

    // "b is larger than a"
    // "a is larger than b"

    if (a > b) {
      String message = a + " is larger than " + b;
      System.out.println(message);
    } else if (b > a){
      String message = b + " is larger than " + a;
      System.out.println(message);
    } else {
      System.out.println("The number is equal");
    }

    /////////////////////////////////////////////
    if (a > b) {
      max = a;
      min = b;
    } else{
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min + ".");

    // Example 4
    String day = "Wednesday";
    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    String[] weekend  = {"Saturday", "Sunday"};

    boolean isWeekend = false;
 
    if (isWeekend) {
      System.out.println(day + " is weekend.");
  } else {
      System.out.println(day + " is weekday.");
  }

    // "Wednesday is weekday."
    // "Saturday is weekday."
    // "Sunday is weekday."

    // Approach 2
    if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day)){
      System.out.println(day + " is weekday.");
    } else {
      System.out.println(day + " is weekend.");
    }

    // Approach 3
    boolean weekday = "Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) 
    || "Friday".equals(day); //? true:false;

    // boolean weekend = "Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) 
    // || "Friday".equals(day) ? false:true;

    if (weekday){
      System.out.println(day + " is weekday.");
    } else {
      System.out.println(day + " is weekend.");
    }

    // Example 5
    int num = 7;

    if (num % 2 == 0){
      System.out.println(num + " is an even number");
    } else{
      System.out.println(num + " is an odd number");
    }

    // 7 is an odd number
    // 8 is an even number

    // Example 6
    String str = "hello";
    
    // "" -> emtry string
    // Sample output:
    // The last character of str is o
    // This is an emtry String

    if (str.length() == 0){
      System.out.println("This is an emtry String.");
    } else {
      System.out.println("The last character of str is " + str.charAt(str.length() -1));
    }

    // Example 7
    // Reserve String
    String s = "abc";

    // The reversed string is "cba"

    // Example 8
    // Leap Year
    // 1. Divided by 4
    // 2. Not divided by 100
    // 3. Or divided by 400

    int year = 1900;
    // Sample output:
    // 1900 is not a leap year
    // 2000 is a leap year
    // 2004 is a leap year

    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
      System.out.println(year + " is a Leap Year");
  } else {
      System.out.println(year + " is Not a Leap Year");
  }
    
    // Example 9
    int age = 20;
    boolean isCitizen = false;

    // age 18 or above and he is a citizen -> eligible to vote.

    // Eligible to vote
    // Not eligible. Age < 18
    // Not eligible. Not a citizen.
    // Not eligible. Age < 18 and not a citizen

    if ((age > 18) && (isCitizen)){
      System.out.println("Eligible to vote");
    } else{
      System.out.println("Not eligible to vote");
    }

    // Example 10
    double totalPurchase = 250.0;
    double discount = 0.0;
    double amountToPay = totalPurchase;
    // >= 500.0 -> 20% off
    // >= 200.0 -> 10% off
    // < 200.0 -> no discount

    if (totalPurchase >= 500.0) {
      discount = 0.20 * totalPurchase;
  } else if (totalPurchase >= 200.0) {
      discount = 0.10 * totalPurchase;
  }
    amountToPay = totalPurchase - discount;

    System.out.println("Discount amount=" + discount);
    System.out.println("Amount to Pay=" + amountToPay);

    // Example 11
    // a e i o u -> vowel
    // a is vowel
    // c is consonant

    char c = 'a';

    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      System.out.println(c + " is a vowel");
    } else {
      System.out.println(c + " is a consonant");
  }

  // Teaching
  // 
  String s1 = "hello";
  System.out.println(s1.contains("ll"));  // true
  System.out.println(s1.contains("lll")); // false

  s1 = "helloll";
  System.out.println(s1.contains("ll")); // true

  String s2 = "Liverpool";
  System.out.println(s2.contains("oo"));
  System.out.println(s2.contains("var"));

  // Example 12 
  // # ! @ $ -> speical character
  // password length >= 12
  // It is a strong password
  // It is a weak password. No speical character
  // It is a weak password. length < 12

  String password = "Admin12345678#";
  
  boolean isSpecial = password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$");
  

  if (password.length() > 12){
    if (isSpecial) {
      System.out.println("It is a strong password");
    } else {
      System.out.println("It is a weak password. No speical character");
    } 
  }else {
    System.out.println("It is a weak password. length < 12");
    }
  

  }
}