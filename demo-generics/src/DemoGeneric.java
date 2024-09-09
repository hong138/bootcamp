import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args) {
    //
    List list = new ArrayList<String>();
    list.add("abc");
    System.out.println(list);
    list = new ArrayList<Integer>(); // runtime -> new ArrayList<Object>()
    list.add("abc2");
    System.out.println(list);
    }
}
