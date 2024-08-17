
import Demo2.main.Weekday;

public class Demo2 {
  public static void main(String[] args) {
    System.out.println("Hello World");
    var age = 18;
    enum Weekday {
      MON, TUE, WED, THU, FRI, SAT, SUN
    }
    Weekday weekday = Weekday.MON;
    System.out.println(weekday);
  }
}
