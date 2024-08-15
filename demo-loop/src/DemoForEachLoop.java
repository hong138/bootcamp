public class DemoForEachLoop {
  public static void main(String[] args) {
    // The main different between for-loop and for-each loop
    // for-loop -> able to access all elements during each iteration
    // for-each loop -> easy to read/use, because no index
    // for loop
    int[] arr = new int [] {2, 9, 10, -3};

    // i -> array index
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    // print out element

    // for-each loop
    // i -> element
    int sum = 0;
    for (int i : arr) { // supports continue and break
      // System.out.println(i);
      sum += 1;
    }
    // print out element

    String[] drinks = new String[] {"coke", "juice", "beer"};
    // for-each loop string array
    for (String drink : drinks){
      if (drink != null && "c".equals(drink.substring(0,1))){
        System.out.println(drink.charAt(drink.length() - 1));
      }
    }

    // default value - Wrapper Class / String
    Integer x = null;
    System.out.println(x); // null
    // x.intValue(); // error

    String s = null;
    System.out.println(s);
    // s.charAt(0); // error, Null Pointer Exception

    s = ""; // emtry is an String object
    s.charAt(0); // error, not 









  }
}
