public class DemoSwitch {
  public static void main(String[] args) {
    int age = 18;
    boolean isAdult = false;
    if (age >= 18){
      isAdult = true;
    }

    // 1. if you don't not "break" the switch case, the flow will go through all cases.
    // 2. for case, you can only define one value for checking. No range checking.
    // 3. "Switch" statment is only for finite scenario
    // 4. For "Switch", Java will check your case value, it alerts when there is duplicated.
    switch (age){
      case 18:
       isAdult = true;
       System.out.println("18");
       break;
      case 17:
       isAdult = false;
       System.out.println("17");
       break;
      case 16:
       isAdult = false;
       System.out.println("16");
       break;
    }
    System.out.println("isAudlt=" + isAdult);

    // 
    String day = "Monday";
    switch (day) {
        case "Monday":
          System.out.println("It is weekday1");
          break;
        case "Tuesday":
          System.out.println("It is weekday2");
          break;
        case "Wednesday":
          System.out.println("It is weekday3");
          break;
        case "Thursday":
          System.out.println("It is weekday4");
          break;
        case "Friday":
          System.out.println("It is weekday5");
          break;
        default:
          System.out.println("It is weekend");
    }
    int x = 3;
    int y = (x++ + 3) * x++;
    // (3 + 3) * 4
    System.out.println(x);
    System.out.println(y);



  }
}
