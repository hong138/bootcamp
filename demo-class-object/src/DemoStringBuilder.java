public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    System.out.println(s);

    // Solution (leetcode -> avoid to use String concat)
    // StringBuilder will solve the performance issue
    StringBuilder sb = new StringBuilder("hello");
    sb.append("!!!"); // revise its attribute value, and then return its address
    char last = sb.append("???").append("hihi").charAt(sb.length()-1);
    System.out.println(sb.toString()); // hello!!!???hihi
    System.out.println(last); // i
    System.out.println(sb); // hello!!!???hihi
    System.out.println(sb.reverse()); // return a new String -> ihih???!!!olleh
    System.out.println(sb); // revised itself

    // !!! Most of the String.class method exists in StringBuilder.class
    // 1. length()
    // 2. charAt()
    // 3. substring()
    // etc...

    long startTime = System.currentTimeMillis();
    String s1 = "";
    for (int i = 0; i < 100_000; i++) {
      s1 = s1.concat("a");
    }
    long afterTime = System.currentTimeMillis();
    System.out.println(afterTime - startTime); // 3367ms

    startTime = System.currentTimeMillis();
    StringBuilder sb2 = new StringBuilder("");
    for (int i = 0; i < 100_000; i++) {
      sb2.append("a");
    }
    afterTime = System.currentTimeMillis();
    System.out.println(afterTime - startTime); // 3ms

    System.out.println(sb.reverse());

    String s2 = "hellolllollklll";
    String s3 = s2.replace("lll", "x");
    System.out.println(s3);

    System.out.println(s2.indexOf("lll"));

  }
}
