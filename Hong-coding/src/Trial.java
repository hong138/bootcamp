public class Trial {
  public static void main(String[] args) {
    byte hoursOfDay = 24;
    byte daysOfWeek = 7;
    byte hoursOfWeek = (byte) (hoursOfDay * daysOfWeek); // = -128 +(7 * 24 + 1)
    System.out.println(hoursOfWeek);
  }
}
