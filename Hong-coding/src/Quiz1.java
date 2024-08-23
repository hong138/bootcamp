public class Quiz1 {
  public static void main(String[] args) {

    // Question 2
    // byte hoursOfDay = 24;
    // byte daysOfWeek = 7; // byte * byte -> int 
    // byte houseOfWeek = (byte) (hoursOfDay * daysOfWeek); // = -128 + (7 * 24 (+ 1)???)
    // System.out.println(houseOfWeek); // -88 (-128 + (7 * 24 - 127 - 1))???
    // 129 -> -127 (-128 + (129 - 127 - 1))

    // byte wrappedValue = (byte) (houseOfWeek % 256);
    // System.out.println(168 % 256);

    // Question 5
    // String str = "";

    // for (byte i = 127; i < 128; i++){
    //   str += i;
    //   if (i < 0){
    //     break;
    //   }
    // }
    // System.out.println(str); // 127-128
    

    // Question 6
    // String str2 = "";
    // for (byte i= 127;i < 128;i++){
    //   if (i < 0){
    //     continue;
    //   }
    //   str2 += i;
    // }
    // System.out.println(str2);


    // Question 8
    // String[] strings = new String[3];
    // String sum = "";

    // for (int i = 0; i < 4; i++){
    //   strings[i] = String.valueOf(i);
    //   sum += strings[i];
    // }
    // System.out.println(sum);


    // Question 9
    int a = 0;
    while (a < 3){
      switch(a){
        case 0:
          System.out.println("0");
        case 2:
          System.out.println("2");
      }
      a++;
    }
    System.out.println(a++);
  }
}
