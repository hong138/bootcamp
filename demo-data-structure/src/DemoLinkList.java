import java.util.List;

public class DemoLinkList {
  public static void main(String[] args) {
    // ArrayList vs LinkedList
    // Same:
    // 1. Implement List Interface: add(), remove(), size(), get()...
    // 2. With Ordering 

    // Different:
    // 1. Polymorphism -> different implementation for same methods (almost all method)
    // 2. Performance: Add/remove head/tail element -> LinkedList perform better
    //  if we know the exact index of position for searching, ArratList will be better

    public static int search(List<String> strings, String target){
      for (int i = 0; i < strings.size() ; i++) {
        if (target.equals(strings.get(i))){ // ArrayList will perform better in get() method
          return i;
      }
      return -1;
    }
  }
}
