public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'o'; // Update this target to test the logic
    int pos = -1;

    // if not found, print "Not Found."
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'o'){
        pos = i;
      }
    }System.out.println("The index of the last character of " + target + " is " + pos);
  }
}
//  The index of the last character of c is 11