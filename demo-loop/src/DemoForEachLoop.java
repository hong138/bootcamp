public class DemoForEachLoop {
  public static void main(String[] args) {
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
      if ("c".equals(drink.substring(0,1))){
        System.out.println(drink.charAt(drink.length() - 1));

      }
    }









  }
}
