
import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    // User input
    // Scanner s = new Scanner(System.in);
    // System.out.println("Please input a number: ");
    // int input = s.nextInt(); // terminal will stop here, and wait for a user input
    // After capturing the user input -> assignment

    // System.out.println("The user input=" + input);

    // the user input is an odd number
    // the user input is an even number

    System.out.println("Please input a number: ");
    Scanner s2 = new Scanner(System.in);
    int input = s2.nextInt();

    if (input % 2 == 1) {
      System.out.println("The user input is an odd number.");
    } else{
      System.out.println("The user input is an even number.");
    }

    // Example 2
    // "Choose an option: 1) Deposit 2) Withdraw 3) Check Balance"
    // if user input 1
      // Question -> "Please input the deposit amount:"
        // print out amount after deposit
    // if user input 2
      // Question -> "Please input the withdrawal amount:"
        // print out amount after withdrawal
    // if user input 3
      // Print out current balance

    double currentBalance = 300.0;
    Scanner s3 = new Scanner(System.in);
    System.out.println("Choose an option: 1) Deposit 2) Withdraw 3) Check Balance");
    int option = s3.nextInt();

    switch (option) {
        case 1:
          System.out.println("Please input the deposit amount:");
          double depositAmount = s3.nextDouble();
          currentBalance += depositAmount;
          System.out.println("Amount after deposit: " + currentBalance);
          break;
        case 2:
          System.out.println("Please input the withdrawal amount:");
          double withdrawalAmount = s3.nextDouble();
          currentBalance -= withdrawalAmount;
          System.out.println("Amount after withdrawal: " + currentBalance);
        case 3:
          System.out.println("Current balance:" + currentBalance);
    }
  }
}
