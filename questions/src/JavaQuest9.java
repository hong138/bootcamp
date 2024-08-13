public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    char J = 'J';
    char e = 'e';
    char idx = ' ';
    char idx2 = ' ';

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == J){
        idx = str.charAt(i);
      } else if (str.charAt(i) == e){
        idx2 = str.charAt(i);
      }
    }
    System.out.println(idx);
    System.out.println(idx2);

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));

    // Use String trim()
    String abc = "    ab c    ";
    abc = abc.trim();
    System.out.println(abc);

    // prints "ab c"

    // Use String replace() method
    // prints VenturenixLAB, Coding
    String str2 = str.replace("Java", "Coding");
    System.out.println(str2);

    // int length()
    // prints 19
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    String sub = str.substring(5, 8);
    System.out.println(sub);

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    System.out.println(str.toUpperCase()); 
    System.out.println(str.toLowerCase()); 

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    System.out.println(str.replace("e", "*").toUpperCase().concat("!!!"));
  }
}
