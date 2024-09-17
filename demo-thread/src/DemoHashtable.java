import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {
  // private Map<Integer, String> nameMap = new HashMap<>();

  // Hashtable is synchronized version of HashMap
  private Map<Integer, String> nameMap = new Hashtable<>();

  public Map<Integer, String> getNameMap() {
    return this.nameMap;
  }

  public static void main(String[] args) throws Exception {
    // Hashtable vs HashMap

    DemoHashtable demoht = new DemoHashtable();
    Runnable addName = () -> {
      for (int i = 0; i < 100; i++) {
        demoht.getNameMap().put(i, "x");
      }
    };

    Runnable addName2 = () -> {
      for (int i = 0; i < 100; i++) {
        demoht.getNameMap().put(i, "y");
      }
    };

    Thread thread1 = new Thread(addName);
    Thread thread2 = new Thread(addName2);
    thread1.start();
    thread2.start();

    thread1.join(); // main thread will stop here to wait for thread1 completes
    thread2.join(); // main thread will stop here to wait for thread2 completes
    // !!! Map.size() may not reflect the actual number of entriesa at all times (multi threads)
    System.out.println(demoht.getNameMap().size());

    // Lambda
    demoht.getNameMap().forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
      
    // Other difference of Hashtable and HashMap
    Map<Integer, String> table = new Hashtable<>();
    // !!! 1. Not support null key or value
    // table.put(null, "hello"); // 
    // table.put("hello", null); //


  }
}
