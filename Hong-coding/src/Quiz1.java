public class Quiz1 {
  public static void main(String[] args) {
    // Question 1
    int price = 150;
    int quantity = 10;
    // int discount = 0.9;
    // System.out.println(price * quantity * discount);

    // Question 2
    byte hoursOfDay = 24;
    byte daysOfWeek = 7; // byte * byte -> int 
    byte houseOfWeek = (byte) (hoursOfDay * daysOfWeek); // = -128 + (7 * 24 (+ 1)???)
    System.out.println(houseOfWeek); // -88 (-128 + (7 * 24 - 127 - 1))???
    // 129 -> -127 (-128 + (129 - 127 - 1))

    // byte wrappedValue = (byte) (houseOfWeek % 256);
    // System.out.println(168 % 256);

    // Question 5
    String str = "";

    for (byte i = 127; i < 128; i++){
      str += i;
      if (i < 0){
        break;
      }
    }
    System.out.println(str); // 127-128
    
  }
}
