import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class DemoLocalDate {
  public static void main(String[] args) {
    // 2024-08-30
    // 2024-08-31

    LocalDate date = LocalDate.of(2024, 8, 30);
    System.out.println(date);
    System.out.println(date.plusMonths(3));
    System.out.println(date);
    System.out.println(date.plusDays(90));

    LocalDate yearEnd = LocalDate.of(2024, 12, 31);
    System.out.println(yearEnd.plusDays(1));

    DayOfWeek dow = date.getDayOfWeek();
    System.out.println(dow);

    // !!! always use equals() and compareTo() for non-primitives
    if (date.getDayOfWeek().equals(DayOfWeek.of(5))){
      System.out.println("Its Friday");
    }

    // !!! Normally, "==" is checking if they are same object/address

    // enum
    if (date.getDayOfWeek() == DayOfWeek.of(5)){
      System.out.println("Its Friday");
    }

    System.out.println(date.compareTo(LocalDate.of(2024, 8, 29))); // 1
    System.out.println(date.compareTo(LocalDate.of(2024, 8, 30))); // 0
    System.out.println(date.compareTo(LocalDate.of(2024, 8, 31))); // -1

    LocalDate[] dates = new LocalDate[] {LocalDate.of(2024, 2, 28), LocalDate.of(2024, 3, 28), 
                                         LocalDate.of(2024, 4, 28), LocalDate.of(2024, 6, 4)};
    // Find the Max Date
    LocalDate maxDate = LocalDate.of(1, 1, 1);
    for (LocalDate d : dates) {
        if (d.compareTo(maxDate) > 0){
        maxDate = d;
        }
    }

    System.out.println(maxDate);

    for (int i = 0; i < dates.length; i++) {
      if (dates[i].compareTo(maxDate) > 0){
      maxDate = dates[i];
      }
    }
    System.out.println(maxDate);
    dates[3] = LocalDate.of(2026, 1, 1);
    System.out.println(Arrays.toString(dates));
    System.out.println(maxDate);

    // LocalDate, String, BigDecimal -> immutable
    // "Immutable" -> the object has no method to revise itself



  }
}
