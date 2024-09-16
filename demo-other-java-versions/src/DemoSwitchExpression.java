public class DemoSwitchExpression {
  public static void main(String[] args) {
    // Switch Expression != switch
    Suit suit = Suit.CLUB;

    // !!! before Java 14
    int score = getScore(suit);

    // !!! Java 14
    int score2 = getScore2(suit);

    // default scenario
    // !!! The range of String value is un-defined. So, we have to include "default scenario"
    String day = "Monday";
    String result = switch (day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
      case "Saturday", "Sunday" -> "Weekend";
      default -> "Not Found";
    };

    // !!! yield (Similar to "return", but used in switch expression)
    // !!! For the code block of a case with more than one line of code ...
    int dayNumber = 2; // 1 - 7
    String result2 = switch (dayNumber) {
      case 1 -> {
        yield "Monday";
      }
      case 2 -> {
        yield "Tuesday";
      } 
      case 3 -> {
        yield "Wednesday";
      }
      case 4 -> {
        yield "Thursday";
      }
      case 5 -> {
        yield "Friday";
      }
      case 6 -> {
        yield "Saturday";
      }
      case 7 -> {
        yield "Sunday";
      }
      default -> {
        yield "Not Found";
      }
      };
    }

    // After Java 14, switch expression (similar to lambda)
    // !!! 1. It help check missing/ duplicated emun value (Not Allow)
    // !!! 2. Not require "break". Instead, we return the value directly
    // !!! 3. Switch expression has to return something
    public static int getScore2(Suit suit) {
      return switch (suit) {
      case DIAMOND -> 1;
      case CLUB -> 2;
      case HEART -> 3;
      case SPADE -> 4;
    };
  }
  // Tranditional Switch (before Java 14)
  // !!! Method (return value) + Switch
  // !!! 1. Allow missing enum value
  // !!! 2. You need break yourself
  // !!! 3. No return value

  public static int getScore(Suit suit) {
    int score = -1;
    switch (suit) {
      case DIAMOND:
        return 1;
        break;
      case CLUB: 
        return 2;
        break;
      case HEART:
        return 3;
        break;
      case SPADE: 
        return 4;
        break;
    }
    return score;
  }
}
